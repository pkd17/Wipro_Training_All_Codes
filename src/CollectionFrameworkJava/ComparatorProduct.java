package CollectionFrameworkJava;

import java.util.*;

public class ComparatorProduct implements Comparator<Product> {

    
    public int compare(Product o1, Product o2) {
        return o1.price - o2.price;
    }

    public static void main(String[] args) {
        List<Product> Product = new ArrayList<>();

        Product.add(new Product("Laptop", 50000));
        Product.add(new Product("Mobile", 20000));
        Product.add(new Product("Tablet", 30000));
        Product.add(new Product("Mobile", 15000));
        Product.add(new Product("Laptop", 50000)); 

        Collections.sort(Product, new ComparatorProduct());

        for (Product pro : Product){
            System.out.println(pro);
        }
    }
}