/********************************************************************************
** Form generated from reading ui file 'SongTable.jui'
**
** Created: Tue May 7 19:39:40 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package upv.ipc;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_SongTable implements com.trolltech.qt.QUiForm<QWidget>
{
    public QTableView tableView;

    public Ui_SongTable() { super(); }

    public void setupUi(QWidget SongTable)
    {
        SongTable.setObjectName("SongTable");
        SongTable.resize(new QSize(512, 431).expandedTo(SongTable.minimumSizeHint()));
        tableView = new QTableView(SongTable);
        tableView.setObjectName("tableView");
        tableView.setGeometry(new QRect(30, 20, 401, 331));
        retranslateUi(SongTable);

        SongTable.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget SongTable)
    {
        SongTable.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("SongTable", "Form", null));
    } // retranslateUi

}

