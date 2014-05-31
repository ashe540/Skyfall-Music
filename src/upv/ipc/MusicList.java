package upv.ipc;

import com.sun.rowset.internal.Row;
import com.trolltech.qt.core.QAbstractItemModel;
import com.trolltech.qt.core.Qt.Orientation;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QWidget;

public class MusicList extends QWidget {

    Ui_MusicList ui = new Ui_MusicList();

    public static void main(String[] args) {
        QApplication.initialize(args);

        MusicList testMusicList = new MusicList();
        testMusicList.show();

        QApplication.exec();
    }

    public MusicList() {
        ui.setupUi(this);
        setupUI();
    }

    public MusicList(QWidget parent) {
        super(parent);
        ui.setupUi(this);
        
    }
    
    public void setupUI(){
    	
TrackList trackList = new TrackList();
		

		Track a = new Track("Legendary", "The Summer Set", "Legendary", "4:38", 3025,"2013", null);
		Track b = new Track("Wake me Up When September Ends", "Green Day", "Day in Euphoria", "3:38", 2025,"2013", null);
		Track c = new Track("Best That You Can Be", "Artist vs Poet", "Christmas", "2:38", 1018,"2013", null);
		Track d = new Track("Robots", "", "iRobot Soundtrack", "4:38", 3025,"2013", null);
		Track e = new Track("Cats in Flames", "Metallica", "Summer Day", "4:38", 3025,"2013", null);
		Track f = new Track("Network Beats", "Michael Jackson", "Peephone", "4:38", 3025,"2013", null);
		Track g = new Track("Silly Goose", "Lovers will Die", "Losers", "4:38", 3025,"2013", null);
		Track h = new Track("Added Functions", "Pussies", "Xperia Sounds", "4:38", 3025,"2013", null);
		
	
		trackList.getLibrary().add(a);
		trackList.getLibrary().add(b);
		trackList.getLibrary().add(c);
		trackList.getLibrary().add(d);
		trackList.getLibrary().add(e);
		trackList.getLibrary().add(f);
		trackList.getLibrary().add(g);
		trackList.getLibrary().add(h);

		
//		QAbstractItemModel item = null;
//	
//		
//	for(int i=0; i< trackList.getLibrary().size(); i++){
//		
//		Row row = new Row(i, (Track[]) trackList.getLibrary().toArray()[i]);
//		item.insertRow(i);
//	
//	}
//	ui.tableView.setModel(item);
	ui.tableView.show();
		
    	
    }
    
    
    
}
