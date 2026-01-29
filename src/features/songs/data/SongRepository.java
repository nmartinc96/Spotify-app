package features.songs.data;

import features.songs.domain.Song;

import java.util.ArrayList;

public interface SongRepository {
    public ArrayList<Song> findAll ();

}
