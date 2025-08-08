package Lab22_07;
//6.Write a program to print Fibonacci series of n terms where n is input by user :
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		int first=0,second=1;
		System.out.println(n);
		
		for(int i=1;i<=n;i++) {
			System.out.println(first+" ");
			
			int next=first+second;
			first=second;
			second=next;
		}
		sc.close();

	}

}
