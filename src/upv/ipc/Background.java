package upv.ipc;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QPixmap;
import com.trolltech.qt.gui.QWidget;

public class Background extends QWidget {
	
	static int controller = 0;

	
    Ui_Background ui = new Ui_Background();

    public static void main(String[] args) {
        QApplication.initialize(args);

        Background testBackground = new Background();
        testBackground.show();

        QApplication.exec();
    }

    public Background() {
        ui.setupUi(this);
    }

    public Background(QWidget parent) {
        super(parent);
        ui.setupUi(this);
      //  ui.label.setStyleSheet("background-image: url(classpath:/images/2.jpg)");
       // ui.label.setGeometry(new QRect(10, 80, 370,370));
        ui.label.setScaledContents(true);
    }
    
    public void setBackground(String location){
    	
    	if(controller == 0){
    		ui.label.setPixmap(new QPixmap("classpath:"+location));
    		controller++;
    	}
    	
    	else ui.label.setPixmap(new QPixmap(location));
   }
    
      
   
}
