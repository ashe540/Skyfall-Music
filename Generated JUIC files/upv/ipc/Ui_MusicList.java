/********************************************************************************
** Form generated from reading ui file 'MusicList.jui'
**
** Created: Tue May 7 19:41:10 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package upv.ipc;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_MusicList implements com.trolltech.qt.QUiForm<QWidget>
{
    public QTableView tableView;

    public Ui_MusicList() { super(); }

    public void setupUi(QWidget MusicList)
    {
        MusicList.setObjectName("MusicList");
        MusicList.resize(new QSize(632, 416).expandedTo(MusicList.minimumSizeHint()));
        tableView = new QTableView(MusicList);
        tableView.setObjectName("tableView");
        tableView.setGeometry(new QRect(20, 10, 591, 391));
        retranslateUi(MusicList);

        MusicList.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget MusicList)
    {
        MusicList.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MusicList", "Form", null));
    } // retranslateUi

}

