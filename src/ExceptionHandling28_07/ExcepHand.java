package ExceptionHandling28_07;

import java.util.Scanner;




public class ExcepHand {

	public static void main(String[] args) {
		Scanner sc=null;
		try {
			System.out.println("test");
			System.err.println("test1");
			System.out.println(1/1);
			
			String str="Java";
			System.out.println(str.charAt(6));
			sc=new Scanner(System.in);
			
			String string=sc.next();
		}
		catch(ArithmeticException ae) {
			System.err.println("can't divided by zero");
	
		}
		
		
		// TODO Auto-generated method stub

	}

}
