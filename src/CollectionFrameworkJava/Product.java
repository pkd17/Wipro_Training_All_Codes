package CollectionFrameworkJava;

public class Product {

    String productName;
    int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
    public String toString() {
        return  productName +  ":  "+ price ;
    }
}
