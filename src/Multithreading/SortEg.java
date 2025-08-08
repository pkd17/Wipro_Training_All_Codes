package Multithreading;

import java.util.Arrays;

public class SortEg {
	public static void main(String[] args) {
		int[] arr= {4,5,6,1,2,7,8};
		
		Arrays.parallelSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
