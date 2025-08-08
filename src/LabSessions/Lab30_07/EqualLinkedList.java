package Lab30_07;

import java.util.Arrays;
import java.util.LinkedList;

public class EqualLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("Apple", "Ball", "Cat"));
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("Apple", "Ball", "Cat"));

        boolean areEqual = list1.equals(list2);

        System.out.println("LinkedLists are equal: " + areEqual);
    }
}

