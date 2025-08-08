package CollectionFrameworkJava;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEg {

	public static void main(String[] args) {
		//no duplicate are allowed
		//Insertion order
		//only one null is allowed
		//not synchronized
		//slightly slower than hash set
		
		Set<Integer> s=new LinkedHashSet<Integer>();
		
		s.add(50);
		s.add(30);
		s.add(80);
		s.add(90);
		s.add(80);
		s.add(null);
		s.add(100);
		s.add(null);
		
		
		System.out.println(s);
		System.out.println(s.isEmpty());
        System.out.println(s.remove(50));
        System.out.println(s);
        System.out.println(s.add(96));
        System.out.println(s);
        System.out.println(s.size());
		

	}

}
