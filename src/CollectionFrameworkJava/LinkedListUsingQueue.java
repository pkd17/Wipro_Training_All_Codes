package CollectionFrameworkJava;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Queue<String> lang=new LinkedList<>();
       
       lang.add("Satya");
       lang.add("Python");
       lang.add("Java");
       lang.add("C");
       lang.add("C++");
       
       System.out.println(lang);
       //access the 1st element
       System.out.println(lang.peek());
       //remove
       System.out.println(lang.remove("C"));
       System.out.println(lang);
       
	}

}
