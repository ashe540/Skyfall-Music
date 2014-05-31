/********************************************************************************
** Form generated from reading ui file 'Background.jui'
**
** Created: Sun Jun 2 22:23:19 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package upv.ipc.src.upv.ipc;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Background implements com.trolltech.qt.QUiForm<QWidget>
{
    public QAction playAction;
    public QAction pauseAction;
    public QAction stopAction;
    public QVBoxLayout verticalLayout;
    public QLabel label;

    public Ui_Background() { super(); }

    public void setupUi(QWidget Background)
    {
        Background.setObjectName("Background");
        Background.resize(new QSize(421, 368).expandedTo(Background.minimumSizeHint()));
        playAction = new QAction(Background);
        playAction.setObjectName("playAction");
        playAction.setIcon(new QIcon(new QPixmap("classpath:images/play.png")));
        pauseAction = new QAction(Background);
        pauseAction.setObjectName("pauseAction");
        pauseAction.setIcon(new QIcon(new QPixmap("classpath:images/pause.png")));
        stopAction = new QAction(Background);
        stopAction.setObjectName("stopAction");
        stopAction.setIcon(new QIcon(new QPixmap("classpath:images/stop.png")));
        verticalLayout = new QVBoxLayout(Background);
        verticalLayout.setObjectName("verticalLayout");
        label = new QLabel(Background);
        label.setObjectName("label");

        verticalLayout.addWidget(label);

        retranslateUi(Background);

        Background.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Background)
    {
        Background.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Background", "Album", null));
        playAction.setText(com.trolltech.qt.core.QCoreApplication.translate("Background", "Play", null));
        pauseAction.setText(com.trolltech.qt.core.QCoreApplication.translate("Background", "Pause", null));
        stopAction.setText(com.trolltech.qt.core.QCoreApplication.translate("Background", "Stop", null));
        label.setText("");
    } // retranslateUi

}

