package Lab30_07;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;


public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(50, 20, 70, 10, 40));

        Set<Integer> set = new TreeSet<>(numbers);
        List<Integer> sortedList = new ArrayList<>(set);

        if (sortedList.size() >= 2) {
            int secondLargest = sortedList.get(sortedList.size() - 2);
            System.out.println("Second Largest: " + secondLargest);
        } else {
            System.out.println("Not enough elements.");
        }
    }
}

