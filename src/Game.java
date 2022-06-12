public class Game extends Product implements IGame {

        private String distributor;
        private String studio;
        private String genre;

        public Game(){}

        public Game(String name, int id, double price, String distributor, String studio, String genre) {
            super(name, id, price);
            this.distributor = distributor;
        }

        public String getDistributor() {
            return distributor;
        }

        public void setDistributor(String distributor) {
            this.distributor = distributor;
        }

        public String getStudio() {
            return studio;
        }

        public void setStudio(String studio) {
            this.studio = studio;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", distributor='" + distributor + '\'' +
                ", studio='" + studio + '\'' +
                ", genre='" + genre + '\'' +
                "} ";
    }
}
