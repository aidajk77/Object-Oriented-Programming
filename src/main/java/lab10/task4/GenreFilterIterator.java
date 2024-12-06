package lab10.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Song> {
    private ArrayList<Song> playlist;
    private String genre;
    private int index;

    public GenreFilterIterator(ArrayList<Song> playlist, String genre) {
        this.playlist = playlist;
        this.genre = genre;
    }

    public boolean hasNext(){
        if(index < playlist.size() && !playlist.get(index).getGenre().equals(genre) ){
            index++;
        }
        return index < playlist.size();
    }

    public Song next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return playlist.get(index++);
    }

}
