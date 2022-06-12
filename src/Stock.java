import java.util.ArrayList;
import java.util.List;

public class Stock implements IStockManager{

    private ArrayList<IProduct> products;

    public void addProductList(ArrayList<IProduct> products) {
        this.products.addAll(products);

    }

    public Stock(){
        this.products = new ArrayList<>();
    }

    public IProduct getProduct(int id) {
        for(IProduct product : products){
            if(product.getId() == id){
                return product;
            }
        }
        System.out.println("Product not located");
        return null;

    }

    public void addProduct(IProduct product) {
        products.add(product);
    }

    public void updateProduct(int id, IProduct product) {
        for (IProduct p : products){
            if (p.getId() == id){
                products.set(products.indexOf(p), product);
                return;
            }
        }
        System.out.println("Product not located");
    }


    public void removeProduct(int id) {
        List<IProduct> productListCopy = new ArrayList<>(this.products);

        for(IProduct product : productListCopy){
            if(product.getId() == id){
                this.products.remove(product);
                return;
            }
        }
        System.out.println("Product not located");
    }

    public void listProducts(){
        for (IProduct p : products){
            System.out.println(p.toString());
        }
    }

    @Override
    public void quantifyProductsByType(IProduct product) {
        int quantityItems = 0;
        if(product instanceof IBook){
            for (IProduct p : products){
                if (p instanceof IBook)
                    quantityItems++;
            }
        } else if(product instanceof IMovie){
            for (IProduct p : products){
                if (p instanceof IMovie)
                    quantityItems++;
            }
        } else if(product instanceof IGame){
            for (IProduct p : products){
                if (p instanceof IGame)
                    quantityItems++;
            }
        } else if(product instanceof IToy){
            for (IProduct p : products){
                if (p instanceof IToy)
                    quantityItems++;
            }
        } else if(product instanceof IMusicalAlbum){
            for (IProduct p : products){
                if (p instanceof IMusicalAlbum)
                    quantityItems++;
            }
        } else if(product instanceof IAdultProduct){
            for (IProduct p : products){
                if (p instanceof IAdultProduct)
                    quantityItems++;
            }
        }
        System.out.println("There are "+quantityItems+" items of the selected type in stock.");

    }


    @Override
    public void listProductsByType(IProduct product) {
        if(product instanceof IBook){
            for (IProduct p : products){
                if (p instanceof IBook)
                    System.out.println(p);
            }
        } else if(product instanceof IMovie){
            for (IProduct p : products){
                if (p instanceof IMovie)
                    System.out.println(p);
            }
        } else if(product instanceof IGame){
            for (IProduct p : products){
                if (p instanceof IGame)
                    System.out.println(p);
            }
        } else if(product instanceof IToy){
            for (IProduct p : products){
                if (p instanceof IToy)
                    System.out.println(p);;
            }
        } else if(product instanceof IMusicalAlbum){
            for (IProduct p : products){
                if (p instanceof IMusicalAlbum)
                    System.out.println(p);
            }
        }  else if(product instanceof IAdultProduct){
            for (IProduct p : products){
                if (p instanceof IAdultProduct)
                    System.out.println(p);
            }
        }
    }

    public ArrayList<IProduct> getProducts(){
        return products;
    }

}
