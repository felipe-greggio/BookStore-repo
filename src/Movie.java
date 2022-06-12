import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Movie extends Product implements IMovie{

    private String studio;
    private ArrayList<String> directors;
    private ArrayList<String> genres;
    private ArrayList<String> producers;

    public Movie(){}

    public Movie(String name, int id, double price, String studio, ArrayList<String> directors,ArrayList<String> genres, ArrayList<String> producers){
        super(name, id, price);
        this.studio = studio;
        this.directors = directors;
        this.genres = genres;
        this.producers = producers;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public ArrayList<String> getDirectors() {
        return directors;
    }

    public void setDirectors(ArrayList<String> directors) {
        this.directors = directors;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public ArrayList<String> getProducers() {
        return producers;
    }

    public void setProducers(ArrayList<String> producers) {
        this.producers = producers;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", studio='" + studio + '\'' +
                ", directors=" + directors +
                ", genres=" + genres +
                ", producers=" + producers +
                '}';
    }
}
