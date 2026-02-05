package features.authors.data;

import features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorApiLocalDataSource {

    public ArrayList <Author> authorsApiStorage = new ArrayList<>();

    public AuthorApiLocalDataSource() {
        initData ();
    }

    private void initData (){

        Author author1 = new Author("Api 1", "Api Extremo", "01-01-1978", "Española");
        authorsApiStorage.add(author1);

        Author author2 = new Author("Api 2", "Api Oais", "01-01-1970", "Inglesa");
        authorsApiStorage.add(author2);
    }



    public ArrayList <Author> findAll  (){

        return authorsApiStorage;
    }



}

