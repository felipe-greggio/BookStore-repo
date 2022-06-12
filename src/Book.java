import java.util.ArrayList;

public class Book extends Product implements IBook{

    private ArrayList<String> genres;
    private String writer;
    private String publisher;

    public Book(){};

    public Book(String name, int id, double price, ArrayList<String> genres, String writer, String publisher){
        super(name, id, price);
        this.genres = genres;
        this.writer = writer;
        this.publisher = publisher;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", genres=" + genres +
                ", writer='" + writer + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
