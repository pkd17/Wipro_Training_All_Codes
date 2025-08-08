package CollectionFrameworkJava;

import java.util.LinkedList;

public class LinkedListEg {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Saswat");
        ll.add("Pratyush");
        ll.add("ashu");
        ll.add("Satyajit");
        ll.add("Charan");
        ll.add("Prasant");
        ll.add(null);
        ll.add("ravi");

        System.out.println(ll);
        System.out.println(ll.get(2));
        System.out.println(ll.indexOf("ashu"));
        System.out.println(ll.isEmpty());
        System.out.println(ll.remove(4));
        System.out.println(ll.set(4, "king"));
        System.out.println(ll);
        System.out.println(ll.size());
    }
}
