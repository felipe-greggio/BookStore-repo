public class AdultProduct extends Product implements IAdultProduct, IProduct{

    final String LABEL = "for adults only";

    public AdultProduct(String name, int id, double price){
        super(name, id, price);
    }


    public String getLABEL() {
        return LABEL;
    }


    @Override
    public String toString() {
        return "AdultProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", LABEL='" + LABEL + '\'' +
                '}';
    }
}
