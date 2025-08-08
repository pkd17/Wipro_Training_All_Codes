package Lab31_07;

import java.util.*;

public class LabQuestion3 {
    public static void main(String[] args) {
        String str = "pprraatyyusshh";
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : countMap.keySet()) {
            if (countMap.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}

