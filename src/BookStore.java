import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private int id;
    private String name;
    private String address;
    private IStockManager stock;
    private ICashierManager cashier;

    public BookStore(int id, String name, String address, IStockManager stock, ICashierManager cashier) {
        this.name = name;
        this.address = address;
        this.stock = stock;
        this.cashier = cashier;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public IStockManager getStock() {
        return stock;
    }

    public void setStock(IStockManager stock) {
        this.stock = stock;
    }

    public void productPurchase(ArrayList<Integer> ids, ICustomer customer){
        List<IProduct> productListCopy = new ArrayList<IProduct>(stock.getProducts());
        double totalAmountOfPurchase =0;
        double totalAmountOfBooksPurchase = 0;
        double finalAmount =0;
        boolean discount = false;

        for (Integer id : ids){
            for (IProduct product : productListCopy){
                if (product.getId() == id){
                    if(product instanceof IBook){
                        totalAmountOfBooksPurchase += stock.getProduct(id).getPrice();
                    }else if (product instanceof IAdultProduct && !customer.isAdult()){
                        System.out.println("This customer is too young to purchase \""+stock.getProduct(id).getName()+"\". You must be over 18.");
                        continue;
                    } else{
                        totalAmountOfPurchase += stock.getProduct(id).getPrice();
                    }
                    stock.removeProduct(id);
                }
            }
        }
        if(totalAmountOfBooksPurchase > 200.00){
            totalAmountOfBooksPurchase = totalAmountOfBooksPurchase*85/100;
            discount = true;
        }
        finalAmount = totalAmountOfPurchase+totalAmountOfBooksPurchase;
        cashier.setMoneyOnRegister(finalAmount);
        if(discount){
            System.out.printf("Total purchase done for R$ %.2f reais. The 15%% discount on book purchases over R$ 200,00 was applied.\n",finalAmount);
        }else{
            System.out.printf("Total purchase done for R$ %.2f reais. No discount applied.\n",finalAmount);
        }
    }
}
