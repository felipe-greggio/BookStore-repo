import java.util.ArrayList;

public interface IMovie {


    String getStudio();

    void setStudio(String studio);

    ArrayList<String> getDirectors();
    void setDirectors(ArrayList<String> directors);

    ArrayList<String> getGenres();

    void setGenres(ArrayList<String> genres);

    ArrayList<String> getProducers();

    void setProducers(ArrayList<String> producers);
}
