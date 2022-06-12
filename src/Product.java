public abstract class Product implements IProduct  {

    protected int id;
    protected String name;
    protected double price;

    protected Product(){};

    protected Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    protected Product(String name, int id, double price, boolean isAdult) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
