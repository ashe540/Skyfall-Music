package upv.ipc;

import com.trolltech.qt.gui.*;

public class Properties extends QDialog {

    Ui_Properties ui = new Ui_Properties();
  
    
//    private String title;
//    private String artist;
//    private String album;
//    private String year;

    private Track track;
    
    private String filePath;

    
    public Track getTrack(){return this.track;}
    
    public static void main(String[] args) {
        QApplication.initialize(args);

        Properties testProperties = new Properties();
        testProperties.show();

        QApplication.exec();
    }

    public Properties() {
        ui.setupUi(this);
    }

    public Properties(QWidget parent, Track track) {
        super(parent);
        this.track = track;
        
        ui.setupUi(this);
        setupUI();
        
    }
    
    public void setupUI(){
    	
    	setWindowTitle("Edit Song Details");
    	
    	ui.title.setText(track.getTitle());
    	ui.artist.setText(track.getArtist());
    	ui.album.setText(track.getAlbum());
    	ui.year.setText(track.getYear());

    }

    
    public void on_ok_clicked(){
    	
    	String title = ui.title.text();
    	String artist = ui.artist.text();
    	String album = ui.album.text();
    	String year = ui.year.text();
    	
    	 track.setTitle(title);
         track.setArtist(artist);
         track.setAlbum(album);
         track.setYear(year);
         close();
    	
    }
    
    public void on_cancel_clicked(){
 
    	close();
    	
    }
    

    
    public void on_image_browse_clicked(){
    	 
    	filePath = QFileDialog.getOpenFileName(this, tr("Select Album Cover"), ".");
    	ui.album_image.setText(filePath);
    	track.setImagePath(filePath);
    }
   
    
    
}
