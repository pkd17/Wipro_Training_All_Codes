package CollectionFrameworkJava;

import java.util.Set;
import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<Integer>();
        s.add(20);
        s.add(50);
        s.add(10);
        s.add(90);
        s.add(5);
        s.add(10);
     
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.remove(50));
        System.out.println(s);
        System.out.println(s.add(96));
        System.out.println(s);
        System.out.println(s.size());
        
	}

}
