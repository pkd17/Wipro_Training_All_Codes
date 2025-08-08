package Lab30_07;

import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raska", "Saswat", "Pratyush", "Abhi", "Saswat", "Abhi");

        Set<String> uniqueSet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();

        for (String name : names) {
            if (!uniqueSet.add(name)) {
                duplicateSet.add(name);
            }
        }

        System.out.println("Original List: " + names);
        System.out.println("Duplicate Elements: " + duplicateSet);
    }
}

