package data;

import domain.Song;

import java.util.ArrayList;

public interface SongRepository {
    public ArrayList<Song> findAll ();

}
