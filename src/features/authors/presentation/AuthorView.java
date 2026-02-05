package features.authors.presentation;

import features.authors.data.AuthorDataRepository;
import features.authors.data.AuthorMemLocalDataSource;
import features.authors.domain.GetAuthorUseCase;

public class AuthorView {

    public void printAuthors (){

        /*
        Supuestamente esto es lo mismo
        AuthorMemLocalDataSource authorMemLocalDataSource = new AuthorMemLocalDataSource();
        AuthorDataRepository  authorDataRepository = new AuthorDataRepository(authorMemLocalDataSource);
        */

        GetAuthorUseCase getAuthorUseCase = new GetAuthorUseCase(new AuthorDataRepository(new AuthorMemLocalDataSource()));
    }
}
