import java.util.ArrayList;

public interface IStockManager extends IListProducts {

    IProduct getProduct(int id);

    void addProduct(IProduct product);

    void addProductList(ArrayList<IProduct> Product);

    void updateProduct(int id, IProduct product);

    void removeProduct(int id);

    ArrayList<IProduct> getProducts();

}
