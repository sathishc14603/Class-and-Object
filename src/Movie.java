import java.util.Date;
import java.util.List;

public class Movie {
    private String title;
    private String director;
    private Date releaseDate;
    private String genre;
    private List<String> Actors;
    private List<String> Langueages;
    public Movie(){

    }
    public Movie(String title, String director, Date releaseDate, String genre, List<String> actors, List<String> langueages) {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.Actors = actors;
        this.Langueages = langueages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getActors() {
        return Actors;
    }

    public void setActors(List<String> actors) {
        Actors = actors;
    }

    public List<String> getLangueages() {
        return Langueages;
    }

    public void setLangueages(List<String> langueages) {
        Langueages = langueages;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", genre='" + genre + '\'' +
                ", Actors=" + Actors +
                ", Langueages=" + Langueages +
                '}';
    }
}
