package upv.ipc;

import java.util.Iterator;
import java.util.LinkedList;

import com.trolltech.qt.phonon.MediaSource;



public class TrackList implements Iterable<Track> {

	
	private static LinkedList<Track> library;
	
	
	
	public TrackList(){
		
		library = new LinkedList<Track>();
		
	}
	
	public LinkedList<Track> getLibrary() {return library; }
	
	
	
/**
 * Performs search operation on title, artist, album and genre attributes of Tracks	
 * @param query
 * @return LinkedList<Track> with tracks that match query
 */
	
	public LinkedList<Track> search(String query){
		
		LinkedList<Track> result = new LinkedList<Track>();
		
		for(Track track : library){
			
if(track.getTitle().contains(query) || track.getArtist().contains(query) || 
   track.getAlbum().contains(query) || track.getGenre().contains(query)) {
				result.add(track);
				break;			}
			}
		return result;
	}

	/**
	 * Look into providing a UI screen for each of these (iTunes)
	 * @param method
	 * @return
	 */
	
	
public LinkedList<Track> sortBy(int method){
		
		switch(method){
		
		case 0: //title
			
			for(int i=0; i<library.size()-1;i++){
				for(int j=0; j<library.size()-1; j++){
					if(library.get(j).getTitle().compareTo(library.get(j+1).getTitle())>0){
						Track temp = library.get(j);
						library.set(j, library.get(j+1));
						library.set(j+1, temp);	}}}
							break;
		case 1: //artist
			
			for(int i=0; i<library.size()-1;i++){
				for(int j=0; j<library.size()-1; j++){
					if(library.get(j).getArtist().compareTo(library.get(j+1).getArtist())>0){
						Track temp = library.get(j);
						library.set(j, library.get(j+1));
						library.set(j+1, temp);	}}}
							break;
		case 2: //album
		
			
			for(int i=0; i<library.size()-1;i++){
				for(int j=0; j<library.size()-1; j++){
					if(library.get(j).getAlbum().compareTo(library.get(j+1).getAlbum())>0){
						Track temp = library.get(j);
						library.set(j, library.get(j+1));
						library.set(j+1, temp);	}}}
							break;
		case 3: //Play Count
			
			for(int i=0; i<library.size()-1;i++){
				for(int j=0; j<library.size()-1; j++){
					if(library.get(j).getPlayCount()> library.get(j+1).getPlayCount()){
						Track temp = library.get(j);
						library.set(j, library.get(j+1));
						library.set(j+1, temp);	}}}
							break;
		
		default: return null;
							
		}
		

	
		return null;
		
	}
	
	
	public static void main(String[] args){
		
		
		TrackList trackList = new TrackList();
		
		Track a = new Track("Legendary", "The Summer Set", "Legendary", "4:38", 3025, "2013", null);
		Track b = new Track("Wake me Up When September Ends", "Green Day", "Day in Euphoria", "3:38", 2025, "2013", null);
		Track c = new Track("Best That You Can Be", "Artist vs Poet", "Christmas", "2:38", 1018, "2013", null);
		Track d = new Track("Robots", "", "iRobot Soundtrack", "4:38", 3025, "2013", null);
		Track e = new Track("Cats in Flames", "Metallica", "Summer Day", "4:38", 3025, "2013", null);
		Track f = new Track("Network Beats", "Michael Jackson", "Peephone", "4:38", 3025, "2013", null);
		Track g = new Track("Silly Goose", "Lovers will Die", "Losers", "4:38", 3025, "2013", null);
		Track h = new Track("Added Functions", "Pussies", "Xperia Sounds", "4:38", 3025, "2013", null);
		
	
		trackList.library.add(a);
		trackList.library.add(b);
		trackList.library.add(c);
		trackList.library.add(d);
		trackList.library.add(e);
		trackList.library.add(f);
		trackList.library.add(g);
		trackList.library.add(h);

		
		
		
	LinkedList<Track> list = trackList.sortBy(0);
	
	
	for(int i=0; i< library.size(); i++){
		
		System.out.println(trackList.library.get(i).getTitle());
				
		
	}
		
	}

	public int size() {
		return library.size();
	}
	
	public boolean isEmpty(){
		return library.size() == 0;
		
	}
	
	public Track get(int index){
		
		return library.get(index);
		
	}
	
	public void add(Track t){
		
		library.add(t);
	}

	public Track remove(int index){
		
		return library.remove(index);
		

	}

	@Override
	public Iterator<Track> iterator() {
		return new TrackListIterator(this);
	}

	public int indexOf(MediaSource currentSource) {
		return library.indexOf(currentSource);
	}

}
