package Lab22_07;
//5.Write a program to find the factorial value of any number

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        int factorial=1;
        for(int i=1;i<=n;i++) {
        	
        	factorial*=i;
        	
        }
        System.out.println(factorial);
	}

}
