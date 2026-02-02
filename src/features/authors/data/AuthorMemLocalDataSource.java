package features.authors.data;

import features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {

    public ArrayList <Author> authorsMemStorage;

    public ArrayList <Author> findAll  (){
        Author author1 = new Author("1", "Extremo", "01-01-1978", "Española");
        authorsMemStorage.add(author1);

        Author author2 = new Author("2", "Oais", "01-01-1970", "Inglesa");
        authorsMemStorage.add(author1);

        return authorsMemStorage;
    }


}

