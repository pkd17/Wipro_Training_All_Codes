package Lab30_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxElement {

		    public static void main(String[] args) {
		        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(25, 60, 45, 90, 15));

		        int max = Collections.max(numbers);

		        System.out.println("Maximum Element: " + max);

	}

}
