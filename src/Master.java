import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Master {

    public static void main(String[] args) {

        Stock stock = new Stock();
        Cashier cashier = new Cashier();
        BookStore bookStore = new BookStore( 1, "Bookies", "Nowhere Street", stock, cashier);

        Book book1 = new Book("Estatística Básica", 1, 125.99, new ArrayList<>(Arrays.asList("Math", "Technical")), "Pedro Moretin", "Saraiva");
        Book book2 = new Book("Mar Sem Fim", 2, 89.99, new ArrayList<>(Arrays.asList("Adventure", "Biographical")), "Amyr Klink", "Companhia das Letras");
        Game game1 = new Game("Mario Bros",3, 150, "Nintendo","Nintendo","Adventure");
        Game game2 = new Game("Dark Souls",4, 200, "Steam","FromSoftware","Fantasy");
        Movie movie1 = new Movie("Star Wars", 5, 45, "Disney", new ArrayList<>(Arrays.asList("George Lucas")), new ArrayList<>(Arrays.asList("Adventure", "Sci-Fi")), new ArrayList<>(Arrays.asList("George Lucas")));
        Movie movie2 = new Movie("Back to the Future", 6, 45, "Universal Studios", new ArrayList<>(Arrays.asList("Robert Zemeckis")), new ArrayList<>(Arrays.asList("Adventure", "Sci-Fi", "Time Travel")), new ArrayList<>(Arrays.asList("Steven Spielberg")));
        Toy toy1 = new Toy("Barbie", 7, 99.99, "Doll");
        Toy toy2 = new Toy("Ken", 8, 69.99, "Doll");
        MusicAlbum musicAlbum1 = new MusicAlbum("The White Album", 9, 120.99, new ArrayList<>(Arrays.asList("John Lennon", "Paul Mccartney", "George Harrison", "Ringo Starr")), new ArrayList<>(Arrays.asList("Rock", "Pop")), new ArrayList<>(Arrays.asList("Apple")));
        MusicAlbum musicAlbum2 = new MusicAlbum("Bad", 10, 99.99, new ArrayList<>(Arrays.asList("Michael Jackson")), new ArrayList<>(Arrays.asList("Pop", "Rock", "Funk", "Dance")), new ArrayList<>(Arrays.asList("Epic", "CBS")));

        stock.addProductList(new ArrayList<>(Arrays.asList(book1, book2, game1, game2, movie1, movie2, toy1, toy2, musicAlbum1, musicAlbum2)));

        Customer adultCustomer = new Customer("Jorge", "053.870.069-60","9.077.751-3", LocalDate.of(1991, 12, 3));
        Customer childCustomer = new Customer("Zézinho","198.321.956-03", "10.854.623-78", LocalDate.of(2015, 05, 15));

        AdultProduct adultProduct1 = new AdultProduct("Vibrator", 11, 69.69);
        AdultProduct adultProduct2 = new AdultProduct("Handcuffs", 12, 96.96);
        stock.addProductList(new ArrayList<>(Arrays.asList(adultProduct1, adultProduct2)));


        stock.removeProduct(3);
        stock.updateProduct(4, new Game("Zelda Wind Waker", 4, 100, "Nintendo", "Nintendo", "Adventure"));
        stock.getProduct(7);

        bookStore.productPurchase(new ArrayList<>(Arrays.asList(11, 4)), childCustomer);

        bookStore.productPurchase(new ArrayList<>(Arrays.asList(11, 12)), adultCustomer);











    }
}
