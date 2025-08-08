package Lab22_07;
//7.Write a method named is Even that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

public class EvenChecker {
	public static boolean Even(int n) {
		return n%2==0;
		
	}
	

	public static void main(String[] args) {

      int n1=15;
      int n2=8;
      int n3=29;
    	  System.out.println(n1+"is Even?"+Even(n1));
    	  System.out.println(n2+"is Even?"+Even(n2));
    	  System.out.println(n3+"is Even?"+Even(n3));
      }
}
