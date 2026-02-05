package features.authors.data;

import features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {

    public ArrayList <Author> authorsMemStorage = new ArrayList<>();

    public AuthorMemLocalDataSource () {
        initData ();
    }

    private void initData (){

        Author author1 = new Author("1", "Extremo", "01-01-1978", "Española");
        authorsMemStorage.add(author1);

        Author author2 = new Author("2", "Oais", "01-01-1970", "Inglesa");
        authorsMemStorage.add(author2);
    }



    public ArrayList <Author> findAll  (){

        return authorsMemStorage;
    }


}

