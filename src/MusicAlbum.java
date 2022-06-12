import java.util.ArrayList;

public class MusicAlbum extends Product implements IMusicalAlbum{

    private ArrayList<String> musicians;
    private ArrayList<String> genres;
    private ArrayList<String> seals;

    public MusicAlbum(){}

    public MusicAlbum(String name, int id, double price, ArrayList<String> musicians, ArrayList<String> genres, ArrayList<String> seals) {
        super(name, id, price);
        this.musicians = musicians;
        this.genres = genres;
        this.seals = seals;
    }

    public ArrayList<String> getMusicians() {
        return musicians;
    }

    public void setMusicians(ArrayList<String> musicians) {
        this.musicians = musicians;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public ArrayList<String> getSeals() {
        return seals;
    }

    public void setSeals(ArrayList<String> seals) {
        this.seals = seals;
    }

    @Override
    public String toString() {
        return "MusicAlbum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", musicians=" + musicians +
                ", genres=" + genres +
                ", seals=" + seals +
                '}';
    }
}
