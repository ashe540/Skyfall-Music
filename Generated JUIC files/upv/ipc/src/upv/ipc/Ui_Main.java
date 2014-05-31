/********************************************************************************
** Form generated from reading ui file 'Main.jui'
**
** Created: Sun Jun 2 22:23:19 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package upv.ipc.src.upv.ipc;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Main implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionNew_Playlist;
    public QAction actionAdd_Filerary_to_Lib;
    public QAction actionAdd_Folder_to_Library;
    public QAction actionExit;
    public QAction actionUndo;
    public QAction actionRedo;
    public QAction actionCut;
    public QAction actionCopy;
    public QAction actionPaste;
    public QAction actionAbout;
    public QAction actionView_Player;
    public QAction actionLaunch_Visualizer;
    public QAction playAction;
    public QAction pauseAction;
    public QAction stopAction;
    public QAction actionOrder_by_Title;
    public QAction actionOrder_by_Artist;
    public QAction actionOrder_by_Album;
    public QAction actionOrder_by_Play_Count;
    public QAction actionProperty;
    public QAction actionDelete_from_Library;
    public QAction actionOrder_by_Song_Length;
    public QWidget centralwidget;
    public QLabel playbackLayout;
    public QMenuBar menubar;
    public QMenu menuFile;
    public QMenu menuEdit;
    public QMenu menuOrganize;
    public QMenu menuControls;
    public QMenu menuAdvanced;
    public QMenu menuHeko;
    public QStatusBar statusbar;
    public QToolBar toolBar;

    public Ui_Main() { super(); }

    public void setupUi(QMainWindow Main)
    {
        Main.setObjectName("Main");
        Main.resize(new QSize(1152, 551).expandedTo(Main.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Fixed, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(Main.sizePolicy().hasHeightForWidth());
        Main.setSizePolicy(sizePolicy);
        Main.setMinimumSize(new QSize(0, 0));
        Main.setMaximumSize(new QSize(1152, 551));
        Main.setWindowIcon(new QIcon(new QPixmap("classpath:images/Itunes-square-48.png")));
        Main.setAutoFillBackground(false);
        Main.setStyleSheet("");
        actionNew_Playlist = new QAction(Main);
        actionNew_Playlist.setObjectName("actionNew_Playlist");
        actionNew_Playlist.setIcon(new QIcon(new QPixmap("classpath:images/list_playlist.png")));
        actionAdd_Filerary_to_Lib = new QAction(Main);
        actionAdd_Filerary_to_Lib.setObjectName("actionAdd_Filerary_to_Lib");
        actionAdd_Filerary_to_Lib.setIcon(new QIcon(new QPixmap("classpath:images/music-player-icone-8330-48.png")));
        actionAdd_Folder_to_Library = new QAction(Main);
        actionAdd_Folder_to_Library.setObjectName("actionAdd_Folder_to_Library");
        actionAdd_Folder_to_Library.setIcon(new QIcon(new QPixmap("classpath:images/Clouds-MobileMe-64.png")));
        actionExit = new QAction(Main);
        actionExit.setObjectName("actionExit");
        actionExit.setIcon(new QIcon(new QPixmap("classpath:images/Log Out_48x48.png")));
        actionUndo = new QAction(Main);
        actionUndo.setObjectName("actionUndo");
        actionUndo.setIcon(new QIcon(new QPixmap("classpath:images/Undo_48x48.png")));
        actionRedo = new QAction(Main);
        actionRedo.setObjectName("actionRedo");
        actionRedo.setIcon(new QIcon(new QPixmap("classpath:images/Redo_48x48.png")));
        actionCut = new QAction(Main);
        actionCut.setObjectName("actionCut");
        actionCut.setIcon(new QIcon(new QPixmap("classpath:images/Cut_48x48.png")));
        actionCopy = new QAction(Main);
        actionCopy.setObjectName("actionCopy");
        actionCopy.setIcon(new QIcon(new QPixmap("classpath:images/Copy_48x48.png")));
        actionPaste = new QAction(Main);
        actionPaste.setObjectName("actionPaste");
        actionPaste.setIcon(new QIcon(new QPixmap("classpath:images/Paste_48x48.png")));
        actionAbout = new QAction(Main);
        actionAbout.setObjectName("actionAbout");
        actionAbout.setIcon(new QIcon(new QPixmap("classpath:images/Help_48x48.png")));
        actionView_Player = new QAction(Main);
        actionView_Player.setObjectName("actionView_Player");
        actionView_Player.setIcon(new QIcon(new QPixmap("classpath:images/music-player-icone-8330-96.png")));
        actionLaunch_Visualizer = new QAction(Main);
        actionLaunch_Visualizer.setObjectName("actionLaunch_Visualizer");
        actionLaunch_Visualizer.setIcon(new QIcon(new QPixmap("classpath:images/media-Player-icon small.png")));
        playAction = new QAction(Main);
        playAction.setObjectName("playAction");
        playAction.setIcon(new QIcon(new QPixmap("classpath:images/play.png")));
        pauseAction = new QAction(Main);
        pauseAction.setObjectName("pauseAction");
        pauseAction.setIcon(new QIcon(new QPixmap("classpath:images/pause.png")));
        stopAction = new QAction(Main);
        stopAction.setObjectName("stopAction");
        stopAction.setIcon(new QIcon(new QPixmap("classpath:images/stop.png")));
        actionOrder_by_Title = new QAction(Main);
        actionOrder_by_Title.setObjectName("actionOrder_by_Title");
        actionOrder_by_Artist = new QAction(Main);
        actionOrder_by_Artist.setObjectName("actionOrder_by_Artist");
        actionOrder_by_Album = new QAction(Main);
        actionOrder_by_Album.setObjectName("actionOrder_by_Album");
        actionOrder_by_Play_Count = new QAction(Main);
        actionOrder_by_Play_Count.setObjectName("actionOrder_by_Play_Count");
        actionProperty = new QAction(Main);
        actionProperty.setObjectName("actionProperty");
        actionDelete_from_Library = new QAction(Main);
        actionDelete_from_Library.setObjectName("actionDelete_from_Library");
        actionOrder_by_Song_Length = new QAction(Main);
        actionOrder_by_Song_Length.setObjectName("actionOrder_by_Song_Length");
        centralwidget = new QWidget(Main);
        centralwidget.setObjectName("centralwidget");
        playbackLayout = new QLabel(centralwidget);
        playbackLayout.setObjectName("playbackLayout");
        playbackLayout.setGeometry(new QRect(50, 230, 321, 111));
        Main.setCentralWidget(centralwidget);
        menubar = new QMenuBar(Main);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 1152, 22));
        menuFile = new QMenu(menubar);
        menuFile.setObjectName("menuFile");
        menuEdit = new QMenu(menubar);
        menuEdit.setObjectName("menuEdit");
        menuOrganize = new QMenu(menubar);
        menuOrganize.setObjectName("menuOrganize");
        menuControls = new QMenu(menubar);
        menuControls.setObjectName("menuControls");
        menuAdvanced = new QMenu(menubar);
        menuAdvanced.setObjectName("menuAdvanced");
        menuHeko = new QMenu(menubar);
        menuHeko.setObjectName("menuHeko");
        Main.setMenuBar(menubar);
        statusbar = new QStatusBar(Main);
        statusbar.setObjectName("statusbar");
        Main.setStatusBar(statusbar);
        toolBar = new QToolBar(Main);
        toolBar.setObjectName("toolBar");
        Main.addToolBar(com.trolltech.qt.core.Qt.ToolBarArea.TopToolBarArea, toolBar);

        menubar.addAction(menuFile.menuAction());
        menubar.addAction(menuEdit.menuAction());
        menubar.addAction(menuOrganize.menuAction());
        menubar.addAction(menuControls.menuAction());
        menubar.addAction(menuAdvanced.menuAction());
        menubar.addAction(menuHeko.menuAction());
        menuFile.addAction(actionNew_Playlist);
        menuFile.addSeparator();
        menuFile.addAction(actionAdd_Filerary_to_Lib);
        menuFile.addAction(actionAdd_Folder_to_Library);
        menuFile.addSeparator();
        menuFile.addAction(actionExit);
        menuFile.addSeparator();
        menuEdit.addAction(actionUndo);
        menuEdit.addAction(actionRedo);
        menuEdit.addSeparator();
        menuEdit.addAction(actionCut);
        menuEdit.addAction(actionCopy);
        menuEdit.addAction(actionPaste);
        menuEdit.addSeparator();
        menuEdit.addAction(actionDelete_from_Library);
        menuEdit.addAction(actionProperty);
        menuOrganize.addAction(actionView_Player);
        menuOrganize.addAction(actionLaunch_Visualizer);
        menuControls.addAction(playAction);
        menuControls.addAction(pauseAction);
        menuControls.addAction(stopAction);
        menuAdvanced.addAction(actionOrder_by_Title);
        menuAdvanced.addAction(actionOrder_by_Artist);
        menuAdvanced.addAction(actionOrder_by_Album);
        menuAdvanced.addAction(actionOrder_by_Play_Count);
        menuAdvanced.addAction(actionOrder_by_Song_Length);
        menuHeko.addAction(actionAbout);
        toolBar.addAction(playAction);
        toolBar.addAction(pauseAction);
        toolBar.addAction(stopAction);
        toolBar.addSeparator();
        toolBar.addSeparator();
        toolBar.addAction(actionView_Player);
        toolBar.addAction(actionLaunch_Visualizer);
        retranslateUi(Main);

        Main.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow Main)
    {
        Main.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Main", "Skyfall Music", null));
        actionNew_Playlist.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "New Playlist", null));
        actionNew_Playlist.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("Main", "Ctrl+N", null));
        actionAdd_Filerary_to_Lib.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Add File to Library", null));
        actionAdd_Folder_to_Library.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Add Folder to Library", null));
        actionExit.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Exit", null));
        actionExit.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("Main", "Ctrl+Q", null));
        actionUndo.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Undo", null));
        actionUndo.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("Main", "Ctrl+Z", null));
        actionRedo.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Redo", null));
        actionRedo.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("Main", "Ctrl+Y", null));
        actionCut.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Cut", null));
        actionCut.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("Main", "Ctrl+X", null));
        actionCopy.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Copy", null));
        actionCopy.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("Main", "Ctrl+C", null));
        actionPaste.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Paste", null));
        actionPaste.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("Main", "Ctrl+V", null));
        actionAbout.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "About", null));
        actionView_Player.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Show/Hide Player", null));
        actionLaunch_Visualizer.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Launch Visualizer", null));
        playAction.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Play", null));
        pauseAction.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Pause", null));
        pauseAction.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("Main", "Space", null));
        stopAction.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Stop", null));
        actionOrder_by_Title.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Order by Title", null));
        actionOrder_by_Artist.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Order by Artist", null));
        actionOrder_by_Album.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Order by Album", null));
        actionOrder_by_Play_Count.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Order by Play Count", null));
        actionProperty.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Properties", null));
        actionDelete_from_Library.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Delete from Library", null));
        actionDelete_from_Library.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("Main", "Del", null));
        actionOrder_by_Song_Length.setText(com.trolltech.qt.core.QCoreApplication.translate("Main", "Order by Song Length", null));
        playbackLayout.setText("");
        menuFile.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Main", "File", null));
        menuEdit.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Main", "Edit", null));
        menuOrganize.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Main", "View", null));
        menuControls.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Main", "Controls", null));
        menuAdvanced.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Main", "Advanced", null));
        menuHeko.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Main", "Help", null));
        toolBar.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Main", "toolBar", null));
    } // retranslateUi

}

