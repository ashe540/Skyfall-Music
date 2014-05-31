/********************************************************************************
** Form generated from reading ui file 'Properties.jui'
**
** Created: Wed May 29 21:43:52 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package upv.ipc;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Properties implements com.trolltech.qt.QUiForm<QDialog>
{
    public QGroupBox groupBox;
    public QWidget layoutWidget;
    public QVBoxLayout verticalLayout;
    public QHBoxLayout horizontalLayout;
    public QLabel label;
    public QLineEdit title;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_2;
    public QLineEdit artist;
    public QHBoxLayout horizontalLayout_3;
    public QLabel label_3;
    public QLineEdit album;
    public QHBoxLayout horizontalLayout_4;
    public QLabel label_4;
    public QLineEdit year;
    public QHBoxLayout horizontalLayout_5;
    public QLabel label_5;
    public QLineEdit album_image;
    public QToolButton image_browse;
    public QLabel image_preview;
    public QWidget layoutWidget1;
    public QHBoxLayout horizontalLayout_6;
    public QSpacerItem horizontalSpacer;
    public QPushButton ok;
    public QPushButton cancel;

    public Ui_Properties() { super(); }

    public void setupUi(QDialog Properties)
    {
        Properties.setObjectName("Properties");
        Properties.resize(new QSize(380, 234).expandedTo(Properties.minimumSizeHint()));
        groupBox = new QGroupBox(Properties);
        groupBox.setObjectName("groupBox");
        groupBox.setGeometry(new QRect(0, 10, 221, 181));
        layoutWidget = new QWidget(groupBox);
        layoutWidget.setObjectName("layoutWidget");
        layoutWidget.setGeometry(new QRect(10, 20, 201, 161));
        verticalLayout = new QVBoxLayout(layoutWidget);
        verticalLayout.setObjectName("verticalLayout");
        horizontalLayout = new QHBoxLayout();
        horizontalLayout.setObjectName("horizontalLayout");
        label = new QLabel(layoutWidget);
        label.setObjectName("label");

        horizontalLayout.addWidget(label);

        title = new QLineEdit(layoutWidget);
        title.setObjectName("title");

        horizontalLayout.addWidget(title);


        verticalLayout.addLayout(horizontalLayout);

        horizontalLayout_2 = new QHBoxLayout();
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_2 = new QLabel(layoutWidget);
        label_2.setObjectName("label_2");

        horizontalLayout_2.addWidget(label_2);

        artist = new QLineEdit(layoutWidget);
        artist.setObjectName("artist");

        horizontalLayout_2.addWidget(artist);


        verticalLayout.addLayout(horizontalLayout_2);

        horizontalLayout_3 = new QHBoxLayout();
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        label_3 = new QLabel(layoutWidget);
        label_3.setObjectName("label_3");

        horizontalLayout_3.addWidget(label_3);

        album = new QLineEdit(layoutWidget);
        album.setObjectName("album");

        horizontalLayout_3.addWidget(album);


        verticalLayout.addLayout(horizontalLayout_3);

        horizontalLayout_4 = new QHBoxLayout();
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        label_4 = new QLabel(layoutWidget);
        label_4.setObjectName("label_4");

        horizontalLayout_4.addWidget(label_4);

        year = new QLineEdit(layoutWidget);
        year.setObjectName("year");

        horizontalLayout_4.addWidget(year);


        verticalLayout.addLayout(horizontalLayout_4);

        horizontalLayout_5 = new QHBoxLayout();
        horizontalLayout_5.setObjectName("horizontalLayout_5");
        label_5 = new QLabel(layoutWidget);
        label_5.setObjectName("label_5");

        horizontalLayout_5.addWidget(label_5);

        album_image = new QLineEdit(layoutWidget);
        album_image.setObjectName("album_image");

        horizontalLayout_5.addWidget(album_image);

        image_browse = new QToolButton(layoutWidget);
        image_browse.setObjectName("image_browse");

        horizontalLayout_5.addWidget(image_browse);


        verticalLayout.addLayout(horizontalLayout_5);

        image_preview = new QLabel(Properties);
        image_preview.setObjectName("image_preview");
        image_preview.setGeometry(new QRect(200, 30, 161, 141));
        layoutWidget1 = new QWidget(Properties);
        layoutWidget1.setObjectName("layoutWidget1");
        layoutWidget1.setGeometry(new QRect(10, 190, 361, 51));
        horizontalLayout_6 = new QHBoxLayout(layoutWidget1);
        horizontalLayout_6.setObjectName("horizontalLayout_6");
        horizontalSpacer = new QSpacerItem(218, 22, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_6.addItem(horizontalSpacer);

        ok = new QPushButton(layoutWidget1);
        ok.setObjectName("ok");
        ok.setDefault(true);

        horizontalLayout_6.addWidget(ok);

        cancel = new QPushButton(layoutWidget1);
        cancel.setObjectName("cancel");

        horizontalLayout_6.addWidget(cancel);

        retranslateUi(Properties);

        Properties.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Properties)
    {
        Properties.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Properties", "Dialog", null));
        groupBox.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Properties", "Edit Song Properties", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Properties", "Name:", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Properties", "Artist:", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Properties", "Album:", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Properties", "Year:", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Properties", "Album image:", null));
        image_browse.setText(com.trolltech.qt.core.QCoreApplication.translate("Properties", "Browse...", null));
        image_preview.setText("");
        ok.setText(com.trolltech.qt.core.QCoreApplication.translate("Properties", "OK", null));
        cancel.setText(com.trolltech.qt.core.QCoreApplication.translate("Properties", "Cancel", null));
    } // retranslateUi

}

