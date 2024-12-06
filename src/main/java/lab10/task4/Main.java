package lab10.task4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> playlist = new ArrayList<>();
        playlist.add(new Song("song1","artist1","genre1"));
        playlist.add(new Song("song2","artist2","genre2"));
        playlist.add(new Song("song3","artist3","genre1"));
        playlist.add(new Song("song4","artist4","genre3"));
        playlist.add(new Song("song5","artist5","genre1"));
        GenreFilterIterator filterIterator = new GenreFilterIterator(playlist,"genre1");
        while(filterIterator.hasNext()) {
            Song song = filterIterator.next();
            System.out.println(song);
        }
    }
}
