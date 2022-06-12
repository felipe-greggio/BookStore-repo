import java.util.ArrayList;

public interface IBook extends IProduct {


    ArrayList<String> getGenres();

    void setGenres(ArrayList<String> genres);

    String getWriter();

    void setWriter(String writer);

    String getPublisher();

    void setPublisher(String publisher);


}
