package features.songs.domain;

import features.songs.data.SongRepository;

import java.util.ArrayList;

public class GetSongsUseCase {

    private SongRepository songRepository;

    public GetSongsUseCase (SongRepository songRepository){
        this.songRepository
    }

    public ArrayList <Song> execute () {

        return songRepository.findAll();

    }

}
