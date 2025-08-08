package CollectionFrameworkJava;
import java.util.Vector;

public class VectorsEg {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("C");
        vector.add("Python");
        vector.add("C#");
        vector.add("JavaScript");

        System.out.println(vector);

        vector.add(2, "Cobol");
        System.out.println(vector);

        System.out.println(vector.get(3));
        vector.remove(4);
        System.out.println(vector);

        vector.remove("C#");
        System.out.println(vector);

        System.out.println(vector.size());
        System.out.println(vector.capacity());

        System.out.println(vector.contains("Java"));
        System.out.println(vector.contains("C"));

        System.out.println(vector.indexOf("Python"));
    }
}
