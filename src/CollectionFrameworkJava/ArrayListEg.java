package CollectionFrameworkJava;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Saswat");
		al.add("Pratyush");
		al.add("ashu");
		al.add("Satyajit");
		al.add("Charan");
		al.add("Prasant");
		al.add(null);
		al.add("ravi");
		
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("ashu"));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(4));
		System.out.println(al.set(4, "king"));
		System.out.println(al);
		System.out.println(al.size());
	

	}

}
