package CollectionFrameworkJava;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListUsingDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Deque<String> de=new LinkedList<>();
       
       de.addFirst("Java");
       de.add("C");
       de.add("Python");
       de.add("C++");
       de.add("cobol");
       de.addLast("R");
       System.out.println(de);
       de.getFirst();
       System.out.println(de);
       de.removeFirst();
       System.out.println(de);
       de.peekFirst();
       System.out.println(de);
       
       System.out.println(de.pollFirst());
       
       System.out.println(de.pollLast());
       
       de.removeLast();
       System.out.println(de);
       
       de.push("C#");
       System.out.println(de);
       
       
       
       
	}

}
