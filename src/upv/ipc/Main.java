package upv.ipc;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.trolltech.qt.core.QDir;
import com.trolltech.qt.core.QDirIterator;
import com.trolltech.qt.core.QPoint;
import com.trolltech.qt.core.Qt;
import com.trolltech.qt.core.Qt.DockWidgetArea;
import com.trolltech.qt.gui.QAbstractItemView;
import com.trolltech.qt.gui.QAction;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QDockWidget;
import com.trolltech.qt.gui.QFileDialog;
import com.trolltech.qt.gui.QKeyEvent;
import com.trolltech.qt.gui.QMainWindow;
import com.trolltech.qt.gui.QMenu;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QTableWidget;
import com.trolltech.qt.gui.QTableWidgetItem;
import com.trolltech.qt.gui.QTreeWidget;
import com.trolltech.qt.gui.QWidget;
import com.trolltech.qt.phonon.AudioOutput;
import com.trolltech.qt.phonon.MediaObject;
import com.trolltech.qt.phonon.MediaSource;
import com.trolltech.qt.phonon.Phonon;

public class Main extends QMainWindow {

    Ui_Main ui = new Ui_Main();
    QDockWidget contentsWindow;
    private QTableWidget musicTable;
    private AudioOutput audioOutput;
    private MediaObject metaInformationResolver;
    private MediaObject mediaObject;
    static int currentTrackNumber=0;
    static boolean checkForModification = true;
    
    
    TrackList trackList = new TrackList();
     
    private TrackList sources = new TrackList();
    static boolean visibility, isPlayerSmall = false; //Used to control layout states (whether in Visualizer mode or others)
    static String currentSongLength;
    static int key =0;
    static int initiator = 0;
    static Background bg;
    

    public static void main(String[] args) {
        QApplication.initialize(args);

        Main testMain = new Main();
        testMain.show();

        QApplication.exec();
    }

    public Main() {
        ui.setupUi(this);
        
        setWindowTitle("Skyfall Music");
       
        
     //Setup Audio functionalities
        
        audioOutput = new AudioOutput(Phonon.Category.MusicCategory);
        mediaObject = new MediaObject(this);
        metaInformationResolver = new MediaObject(this);

        Phonon.createPath(mediaObject, audioOutput);

        mediaObject.stateChanged.connect(this, "stateChanged(Phonon$State,Phonon$State)");
        metaInformationResolver.stateChanged.connect(this, "metaStateChanged(Phonon$State,Phonon$State)");
        mediaObject.currentSourceChanged.connect(this, "sourceChanged(MediaSource)");
        mediaObject.aboutToFinish.connect(this, "aboutToFinish()");
        
        

        
        ui.playAction.triggered.connect(mediaObject, "play()");
        ui.playAction.triggered.connect(this, "changeVisualizerBG()");
        ui.pauseAction.triggered.connect(mediaObject, "pause()");
        ui.stopAction.triggered.connect(mediaObject, "stop()");
        setup();
    }
    
   
    
    
    
// ***********************************************
// * 	Setup MUSIC TABLE						 *
// ***********************************************
       
    public void setup(){

  	  
    	LinkedList<String> headers = new LinkedList<String>();
        headers.add(tr("Title"));
        headers.add(tr("Duration"));
        headers.add(tr("Artist"));
        headers.add(tr("Album"));
        headers.add(tr("Year"));
        headers.add(tr("Genre"));
        headers.add(tr("Play Count"));
    	
    	 musicTable = new QTableWidget(0, 7);
         musicTable.setHorizontalHeaderLabels(headers);
         musicTable.setSelectionMode(QAbstractItemView.SelectionMode.SingleSelection);
         musicTable.setSelectionBehavior(QAbstractItemView.SelectionBehavior.SelectRows);
         musicTable.cellPressed.connect(this, "tableClicked(int,int)");
         musicTable.cellChanged.connect(this, "cellChanged(int,int)");
//       musicTable.customContextMenuRequested.connect(this, "rightClickMenu()");
         musicTable.horizontalHeader().sectionClicked.connect(this, "sectionClicked(int)");
         //mediaObject.totalTimeChanged.connect(this, "timeChanged(qint64)");
        //musicTable.cellDoubleClicked.connect(this, "play()");
         
         setCentralWidget(musicTable);
    	 musicTable.show();
         
    }
    
    
 // **************************************************
 // * Setup LAYOUTS (PLAYER, VISUALIZER, TABLE VIEW) *
 // **************************************************
       
     public void on_actionView_Player_triggered(){
    	 showPlayer();
   }
     
 public void showPlayer(){
    	 
    	 int posX = geometry().x();
    	 int posY = geometry().y();
    	 
    	 if(musicTable.isHidden()) musicTable.show();
    	 if(isPlayerSmall) setGeometry(posX, posY, 1152, 551);
   
    	 if(!visibility){
        	 
    		if(initiator == 0){
    			bg = new Background(this);
    			bg.setBackground("images/bg.jpg");
    			initiator++;
    		}
    		else bg.show();
   
    	
    //Create album cover area		 
    	contentsWindow = new QDockWidget();
  		contentsWindow.setFixedSize(370,370);
  		
  	//Add it to the left dock area	
  		addDockWidget(DockWidgetArea.LeftDockWidgetArea, contentsWindow);
    	contentsWindow.setWidget(bg);

    //Hack to remove titlebar
    	 QWidget emptyWidget = new QWidget();
    	 contentsWindow.setTitleBarWidget(emptyWidget);
    		 
    	visibility = true;
    	 }
    	 else{
    		 contentsWindow.hide();
    		 visibility=false;
    	 }
     }
    
     public void on_actionLaunch_Visualizer_triggered(){
    	 
    	   	 
    	 if(!visibility) showPlayer();
    	 musicTable.hide(); 
    	 
    	 int posX = geometry().x();
    	 int posY = geometry().y();
    	 setGeometry(posX, posY, 0, 0);
    	 setGeometry(posX, posY, 0, 0);

    	 isPlayerSmall = true;
    	 
     }

// *******************************
// * 	  Actions handlers 	 	 *
// *******************************
     
     
     
     public void on_actionAdd_Filerary_to_Lib_triggered(){
    	 addFiles();
   	 }
     
     public void on_actionAdd_Folder_to_Library_triggered(){
    	 addFilesInFolder();
   	 }
     
     public void on_actionExit_triggered(){
      	 
    	 QApplication.quit();
     }
     
   
     
     
    
// **************************************************
// * 					ADD FILES					*
// **************************************************
     
     
     private void addFiles(){
         List<String> files = QFileDialog.getOpenFileNames(this, tr("Select Music Files"), ".");
      
        try{ 
         
         if (files.isEmpty())return;

         int index = sources.size();
         
         for (String string : files) {
             MediaSource source = new MediaSource(string);
             Track track = new Track("","","","",0,"", source);
             sources.add(track);
                    } 
        

         if (!sources.isEmpty())
      	 metaInformationResolver.setCurrentSource(sources.get(index).getMediaSource());
         
         
        }catch(Exception e){}
    
     }  
     
     
     private void onlyAddFiles(List<String> files){

       try{
    	 
    	 if (files.isEmpty())return;

         int index = sources.size();
         for (String string : files) {
             MediaSource source = new MediaSource(string);
             Track track = new Track("","","","",0,"", source);
             sources.add(track);
              
         } 
       if (!sources.isEmpty())
      	 metaInformationResolver.setCurrentSource(sources.get(index).getMediaSource());
       
       
       }catch(Exception e){}
     }  
     
     
     private void addFilesInFolder(){
       
         String directory = QFileDialog.getExistingDirectory(this, tr("Open Directory"),
                 "/home");
         QDir dir = new QDir(directory);
         
         QDirIterator iter = new QDirIterator(dir);
         List<String> files = new LinkedList<String>();
                 
         
         while(iter.hasNext()){
        	 
        	 String aux = iter.next();
        	 
        		 if(!iter.fileInfo().isDir() ){
              			 
        			 System.out.println("Accepted: "+aux);
        			 files.add(aux);
        		 }
        		 else  System.out.println("Denied: "+iter.next());
    			 
        		 
         }
        	 
        onlyAddFiles(files);	 
        	 
         

         
         
         //         QDir a;
        
         
                      
         }    
     
     
     
// **************************************************
// * 		   Change of state handlers 			*
// **************************************************     
    
    private void sourceChanged(MediaSource source){
        
//Searches which track is the parameter source to access it in "sources"
    	int i=0;
    	for(Track t : sources ){
    		
    		if(t.getMediaSource().equals(source)){
    			musicTable.selectRow(i);
    			break;
    		}

    		 i++;
    	}

    	 musicTable.selectRow(i);
    	
    	
    } 
    
//    private void tableDoubleClicked(int row,int column){
//    	
//
//    	on_actionProperty_triggered();
//    	musicTable.resizeColumnsToContents();
//    }
    
    
    
    private void tableClicked(int row, int column){
    	
    	
        boolean wasPlaying = mediaObject.state().equals(Phonon.State.PlayingState);

        mediaObject.stop();
        mediaObject.clearQueue();
        
        int currentRow = musicTable.currentRow();
        System.out.println("Setting current source to item in row: "+currentRow);
        System.out.println("With song title: "+sources.get(currentRow).getTitle());
        mediaObject.setCurrentSource(sources.get(currentRow).getMediaSource());
        System.out.println(sources.get(currentRow).getTitle());

    	
        try{
        	bg.setBackground(sources.get(currentRow).getImagePath());
        }catch(Exception e){}
    
        
        if (wasPlaying) 
            mediaObject.play();
        else
            mediaObject.stop();
    }
    
    
    @Override
    protected void keyPressEvent(QKeyEvent event) {
    	 if (event.key() == 0x20){
    		 
    		 System.out.println("Spacebar activated");
    	 }		 
    	 }
    
    
    
    /**
     * Sets song to next on the list after current song is done playing
     */
    
    private void aboutToFinish()
    {
    	
   int currentIndex =  getCurrentSourceIndex();
        int index = currentIndex + 1; //Index of next song
       
        try{
        bg.setBackground(sources.get(index).getImagePath());
        }catch(Exception e){}
        
        
      
        sources.get(currentIndex).increasePlayCount(); // Increases playCount counter
        int playCount= sources.get(currentIndex).getPlayCount();

        musicTable.setItem(musicTable.currentRow(),6, new QTableWidgetItem(String.valueOf(playCount)));

        
        
        
        
        
        
        
        if (sources.size() > index){
            mediaObject.enqueue(sources.get(index).getMediaSource());
            wait(2);
            musicTable.selectRow(index);
            
        }
        else{ //If we reach the end of the library we stop playing
            mediaObject.stop();
            
        }
    }
    
    
    
    private void stateChanged(Phonon.State newState, Phonon.State oldState)
    {
        switch (newState) {
            case ErrorState:
                if (mediaObject.errorType().equals(Phonon.ErrorType.FatalError)) {
                    QMessageBox.warning(this, tr("Fatal Error"),
                    mediaObject.errorString());
                } else {
                    QMessageBox.warning(this, tr("Error"),
                    mediaObject.errorString());
                }
                break;

            case PlayingState:
                ui.playAction.setEnabled(false);
                ui.pauseAction.setEnabled(true);
                ui.stopAction.setEnabled(true);
                break;
            
            case StoppedState:
                ui.stopAction.setEnabled(false);
                ui.playAction.setEnabled(true);
                ui.pauseAction.setEnabled(false);
                break;
            
            case PausedState:
                ui.pauseAction.setEnabled(false);
                ui.stopAction.setEnabled(true);
                ui.playAction.setEnabled(true);
                break;
//![10]
            case BufferingState:
                break;
        }
    }
    
    
    public int getCurrentSourceIndex(){
    	
    	//Finds index of current song
    	int i=0;
    	for(Track t : sources ) 
    		if(t.getMediaSource().equals(mediaObject.currentSource())) break;
    		else i++;
    	
    	
        return i; //Index of song
    	
    	
    	
    }
    
    public int getIndexOfTrackFromSource(MediaSource source ){
    	int res = 0;
    	
    	for(Track t :sources){
    		
    		if(t.getMediaSource().equals(source)) return res;
    		
    		res++;
    	}

    	return 0;
    }
    
    
    
    
    public void wait(int k){
		  long time0, time1;
		  time0 = System.currentTimeMillis();
		  do{
		  time1 = System.currentTimeMillis();
		  }
		  while (time1 - time0 < k * 1000);
	  }	
    
    
    public void resizeTable(int a, int b){
    	
    	musicTable.resizeColumnsToContents();
    	
    	
    }
    
    
//    public int timeChanged(QInteger newTime){
//    	
////    	QTime displayTime(NULL, (newTotalTime / 60000) % 60, (newTotalTime / 1000) % 60);
////    	totalTimeLcdNumber->display(displayTime.toString("mm:ss"));
//    	
//    	currentSongLength = String.valueOf(newTime);
//    	return newTime;
//    }
    
    
    
    private void metaStateChanged(Phonon.State newState, Phonon.State oldState)
    {
    	
    	checkForModification = false;
    	
        if (newState.equals(Phonon.State.ErrorState)) {
            QMessageBox.warning(this, tr("Error opening files"),
                metaInformationResolver.errorString());
            while (!sources.isEmpty() &&
                   !(sources.remove(sources.size() - 1).equals(metaInformationResolver.currentSource())));
            return;
        }

        if (!newState.equals(Phonon.State.StoppedState))
            return;

        if (metaInformationResolver.currentSource().type().equals(MediaSource.Type.Invalid))
                return;

        Map<String, List<String>> metaData = metaInformationResolver.metaData();


        String title = "";
        if (metaData.get("TITLE") != null)
            title = metaData.get("TITLE").get(0);

        if (title.equals(""))
            title = metaInformationResolver.currentSource().fileName();

        String artist = "";
        if (metaData.get("ARTIST") != null)
            artist = metaData.get("ARTIST").get(0);

        String album = "";
        if (metaData.get("ALBUM") != null)
            album = metaData.get("ALBUM").get(0);

        String year = "";
        if (metaData.get("DATE") != null)
            year = metaData.get("DATE").get(0);

        QTableWidgetItem titleItem = new QTableWidgetItem(title);
        QTableWidgetItem artistItem = new QTableWidgetItem(artist);
        QTableWidgetItem albumItem = new QTableWidgetItem(album);
        QTableWidgetItem yearItem = new QTableWidgetItem(year);
//![14]
        
        sources.get(currentTrackNumber).setTitle(title);
        sources.get(currentTrackNumber).setArtist(artist);
        sources.get(currentTrackNumber).setAlbum(album);
        sources.get(currentTrackNumber).setYear(year);
        

                
        int currentRow = musicTable.rowCount();
        musicTable.insertRow(currentRow);
        musicTable.setItem(currentRow, 0, titleItem);
        musicTable.setItem(currentRow, 2, artistItem);
        musicTable.setItem(currentRow, 3, albumItem);
        musicTable.setItem(currentRow, 4, yearItem);
    	

        for(int i=0; i<musicTable.rowCount(); i++){
        musicTable.setItem(i,6, new QTableWidgetItem(String.valueOf(0)));
        }


//![15]
        if (musicTable.selectedItems().isEmpty()) {
            musicTable.selectRow(0);
            mediaObject.setCurrentSource(metaInformationResolver.currentSource());
        }

        currentTrackNumber++;
        
        MediaSource source = metaInformationResolver.currentSource();
        
        int index= getIndexOfTrackFromSource(source)+1;
        
        
        System.out.println("Sources size: "+sources.size() + " and index ="+index);
        
        if (sources.size() > index) {
        	
            metaInformationResolver.setCurrentSource(sources.get(index).getMediaSource());
        }
        else {
            musicTable.resizeColumnsToContents();
            if (musicTable.columnWidth(0) > 300)
                musicTable.setColumnWidth(0, 300);
        }
        
        checkForModification = true;
    }
      
    public void on_actionOrder_by_Title_triggered(){

		sources.sortBy(0);
    	
        	
    }
    
public void on_actionOrder_by_Artist_triggered(){
    	
		sources.sortBy(1);
    	
    }

public void on_actionOrder_by_Album_triggered(){
	
	sources.sortBy(2);
	
}

public void on_actionOrder_by_PlayCount_triggered(){
	
	sources.sortBy(3);
	
}
    
    
    
    public void saveImage(){
    	
    	String file = QFileDialog.getOpenFileName(this, tr("Select Album Cover"), ".");
      
         
         if (file.isEmpty())return;
    	
    	
    	
    	
    }
    
    public void on_actionProperty_triggered(){
    	
    	
    	if(musicTable.rowCount() > 0){
    	int index = getCurrentSourceIndex();
    	System.out.println("Current source index: "+index);
    	
    	
    	Track track = sources.get(index);

    	Properties p = new Properties(this, track);
    	p.exec();
    	
    	musicTable.setItem(index, 0, new QTableWidgetItem(track.getTitle()));
    	musicTable.setItem(index, 2, new QTableWidgetItem(track.getArtist()));
    	musicTable.setItem(index, 3, new QTableWidgetItem(track.getAlbum()));
    	musicTable.setItem(index, 4, new QTableWidgetItem(track.getYear()));
    	
    	
//    	System.out.println("Title: "+track.getTitle());
//    	System.out.println("Artists: "+track.getArtist());
//    	System.out.println("Album: "+track.getAlbum());
//    	System.out.println("Year: "+track.getYear());
    	}
    }
    
 
    
    public void on_actionDelete_from_Library_triggered(){
   	 
    	    	
    	if(musicTable.rowCount() > 0){
    	
    	 int currentRow = musicTable.currentRow();
    	 
    	 musicTable.removeRow(currentRow);
   	    sources.remove(currentRow);


   	    System.out.println("Deleting row: "+currentRow);
    	 currentTrackNumber--;
    	
    	// mediaObject.dispose(); //Prevents being able to play the song after deleting (Still saved in mediaObject)
    	 
//    	 MediaSource ms = sources.get(0).getMediaSource();
//    	  
//    		 sourceChanged(ms);
//  	 
        	
    	}
    	 
     }
    
    
    public void cellChanged(int row, int column){
    	
    	try{
    	if(musicTable.rowCount() > 0 && checkForModification){
    	int index = getCurrentSourceIndex();

    	String text = musicTable.item(row, column).text();
    	
    	System.out.println("THE GOODS ARE: "+column);
    	System.out.println("AND VALUE: "+text);
    	System.out.println("WHILE CURRENT ROW IS "+index);

    	
    	switch(column){
    	
    	case 0:
        	sources.get(index).setTitle(text);
        	break;
    	case 2:
        	sources.get(index).setArtist(text);
        	break;
    	case 3:
        	sources.get(index).setAlbum(text);
        	break;
    	case 4:
        	sources.get(index).setYear(text);
        	break;
        default: 
        	break;

    	}
    	
    	
    }
    	}catch(Exception e){}
        
    	}
    
    
	
    public void sectionClicked(int column){
     musicTable.sortByColumn(column, Qt.SortOrder.AscendingOrder);
     
    
     switch(column){
     
     case 0:
         on_actionOrder_by_Title_triggered();
         break;
     case 2:
         on_actionOrder_by_Artist_triggered();
         break;
     case 6:
    	 on_actionOrder_by_PlayCount_triggered();
     default:
    	 break;
         
     }
     
     
     
     
     
    }
    
    public void changeVisualizerBG(){
    	
    	  MediaSource source = metaInformationResolver.currentSource();
          
          int index= getIndexOfTrackFromSource(source);
          
        Track track = sources.get(index);
    	
    	if(!track.getImagePath().equals("")){
    	
   		try{
    	bg.setBackground(track.getImagePath());

    	updateImageIfSameAlbum(track.getImagePath());

    	
    	bg.show();
   		
   		}catch(Exception e){}
    	
    	}
    }
    
    public void updateImageIfSameAlbum(String filepath){
    	
    	System.out.println("I'm HEREEE!");
    	
    	for(Track t : sources){
    		
    		if(t.getAlbum().equals(sources.get(getCurrentSourceIndex())))
    			t.setImagePath(filepath);
    		
    	}
    	
    	
    	
    }
    
    
    
}
     
     
