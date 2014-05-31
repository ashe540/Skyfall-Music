package upv.ipc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import javax.sound.midi.Track;

 
public class TrackListIterator<String> implements Iterator<Object> {
 
  private LinkedList<?> trackList;
  private int position;
 
  public TrackListIterator(TrackList trackList) {
    this.trackList = trackList.getLibrary();
  }
 
  @Override
  public boolean hasNext() {
    if (position < trackList.size())
      return true;
    else
      return false;
  }
 
  @Override
  public Object next() {
    Object o = trackList.get(position);
    position++;
    return o;
  }
 
  @Override
  public void remove() {
    trackList.remove(position);
  }
 
}