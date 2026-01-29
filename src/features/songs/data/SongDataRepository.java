package features.songs.data;

import features.songs.domain.Song;

import java.util.ArrayList;

public class SongDataRepository implements SongRepository {
    @Override
    public ArrayList<Song> findAll() {
        Song song1 =new Song();
        song1.setId("1");
        song1.setTitle("La Macarena");
        song1.setAuthor("Los del Rio");
        song1.setDuration("3:45:00");


        Song song2 =new Song();
        song1.setId("2");
        song1.setTitle("Pollito");
        song1.setAuthor("La Rosalia");
        song1.setDuration("3:05:00");


        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);

        return songs;
    }
}
