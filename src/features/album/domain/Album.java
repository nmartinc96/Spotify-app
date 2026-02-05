package features.album.domain;

public class Album {

    private String name;
    private String publicationYear;
    private String genre;


    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public Album(String name, String publicationYear, String genre) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }
}
