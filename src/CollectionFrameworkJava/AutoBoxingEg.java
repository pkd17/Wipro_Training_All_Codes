package CollectionFrameworkJava;

public class AutoBoxingEg {
    public static void main(String[] args) {
        Integer numObj = 25;       // Wrapper class (autoboxing happened here)
        int num = numObj;          // Unboxing: Integer → int

        System.out.println(num);
    }
}