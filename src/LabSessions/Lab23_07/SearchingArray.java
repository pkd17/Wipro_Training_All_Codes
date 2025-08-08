package Lab23_07;
import java.util.Scanner;

public class SearchingArray {
	public static void main(String[] args) {
		
		int arr[]= {13,15,12,11,17,19,21,5,16};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value to be Searching");
		
		int e=sc.nextInt();
		
		boolean flag=false;{
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==e) {
					System.out.println(e+"Found in index:"+i);
					flag=true;
				}
				
			}
			if(flag==false) {
				System.out.println(e+"not found");
			}
		}
	}

}
