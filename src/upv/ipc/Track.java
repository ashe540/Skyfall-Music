package upv.ipc;

import com.trolltech.qt.phonon.MediaSource;


public class Track {

	
	private String title;
	private String artist;
	private String album;
	private String length;
	private int rating; // 0 to 5 stars
	private int trackNumber;
	private String genre;
	private int fileSize;
	private String year;
	private String imagePath;
	private int playCount;
	private MediaSource source;
	
	
	
	
	
	public Track(String title, String artist, String album, String length, int fileSize, String year, MediaSource source){
		
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.length = length;
		this.fileSize = fileSize;
		this.year = year;
		this.source = source;
		this.imagePath = "classpath:images/bg.jpg";
		playCount = 0;
		
	}

	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}

	public String getArtist() {return artist;}
	public void setArtist(String artist) {this.artist = artist;}
	
	public String getAlbum() {return album;}
	public void setAlbum(String album) {this.album = album;}
	
	public String getLength() {return length;}
	public void setLength(String length) {this.length = length;}
	
	public int getRating() {return rating;}
	public void setRating(int rating) {	this.rating = rating;}
	
	public int getTrackNumber() {return trackNumber;}
	public void setTrackNumber(int trackNumber) {this.trackNumber = trackNumber;}
	
	public String getGenre() {return genre;}
	public void setGenre(String genre) {this.genre = genre;}
	
	public int getFileSize() {return fileSize;}
	public void setFileSize(int fileSize) {	this.fileSize = fileSize;}
	
	public String getYear() {return year;}
	public void setYear(String year) {	this.year = year;}
		
	public MediaSource getMediaSource() {return this.source;}
	public void setMediaSource(MediaSource source) {this.source = source;}
	
	public String getImagePath() {return this.imagePath;}
	public void setImagePath(String imagePath) {this.imagePath = imagePath;}	
	
	public int getPlayCount(){return this.playCount;}
	public void increasePlayCount(){this.playCount++;}
	
}
