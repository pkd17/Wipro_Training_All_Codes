package Lab30_07;

import java.util.ArrayList;
import java.util.Collections;

public class SortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(50);
        ar.add(60);
        ar.add(80);
        ar.add(100);
        ar.add(30);
        ar.add(10);
        
        System.out.println(ar);
        
        Collections.sort(ar);
        
        System.out.println("Sorted List is:"+ ar);
        
	}

}
