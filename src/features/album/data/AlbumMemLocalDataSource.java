package features.album.data;

import features.album.domain.Album;

import java.util.ArrayList;

public class AlbumMemLocalDataSource {

    public ArrayList <Album> albumsMemStorage = new ArrayList<>();

    public AlbumMemLocalDataSource () { initData (); }

    private void initData () {
        Album a1 = new Album("Album1", "2025", "Genero1");
        Album a2 = new Album("Album2", "2026", "Genero2");
    }

    p
}
