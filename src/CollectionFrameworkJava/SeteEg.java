package CollectionFrameworkJava;

import java.util.Set;
import java.util.TreeSet;

public class SeteEg {

	public static void main(String[] args) {
		//Contains no duplicate elements
		Set<String> s=new TreeSet<String>();
         s.add("banana");
         s.add("grapes");
         s.add("apple");
         s.add("null");
         s.add("pineapple");
         s.add("orange");
         
         System.out.println(s);
         System.out.println(s.isEmpty());
         System.out.println(s.remove("apple"));
         System.out.println(s);
         System.out.println(s.add("Lichi"));
         System.out.println(s);
         System.out.println(s.size());
         
         
	}

}
