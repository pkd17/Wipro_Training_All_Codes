package Lab31_07;

import java.util.Arrays;

public class LabQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {15,10,8,20,18,30};
       
       Arrays.sort(arr);
       
       int n=arr.length;
       int largest=arr[n-1];
       
       for(int i=n-2;i>=0;i--) {
    	   if(arr[i]!=largest) {
    		   System.out.println(arr[i]);
    		   return;
    	   }
    	   
       }
	}

}
