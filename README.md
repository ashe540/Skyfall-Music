Skyfall-Music
=============

Media Player based on QT Jambi. This small application allows to import files and folders of songs and modify
their properties such as their name, artist, album, and more.


### FUNCTIONALITY:

This is the functionality that is currently implemented:

1. Import songs
2. Deleting songs from library (cool to be able to right click on table and delete)
3. Modify property of songs (same as above)
4. Play, Pause and Stop music
5. Change visualizer between three different Views
6. Order elements in table using table headers

Not implemented:

1. Playlists 
2. Order elements using Advanced -> Order by commands
3. Accept formats other than .mp3 (Currently using `Phonon` class)
4. Grab additional metatags

##### Known bugs:

* Adding new songs using _File -> Add Folder to Library_ overwrites previously added songs
* Changing a song's album image does not update automatically
* Right click on song automatically starts playing it
* A lot more to come...