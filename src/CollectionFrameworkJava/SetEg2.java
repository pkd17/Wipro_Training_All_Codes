package CollectionFrameworkJava;

import java.util.Set;
import java.util.TreeSet;

public class SetEg2 {

	public static void main(String[] args) {

		Set<Integer> s=new TreeSet<Integer>();
         s.add(20);
         s.add(50);
         s.add(10);
         s.add(90);
         s.add(5);
         s.add(50);
      
         System.out.println(s);
         System.out.println(s.isEmpty());
         System.out.println(s.remove(50));
         System.out.println(s);
         System.out.println(s.add(96));
         System.out.println(s);
         System.out.println(s.size());
         
         
	}

}