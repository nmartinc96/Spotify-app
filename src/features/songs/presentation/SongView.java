package features.songs.presentation;

import features.songs.domain.GetSongsUseCase;
import features.songs.domain.Song;

import java.util.ArrayList;

public class SongView {

    public static void printSong(){

        GetSongsUseCase  getSongsUseCase = new GetSongsUseCase();

        ArrayList <Song>  songArrayList = getSongsUseCase.execute();

        System.out.println(songArrayList);

    }
}

