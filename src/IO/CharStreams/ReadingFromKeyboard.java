package IO.CharStreams;
import java.util.Scanner;
public class ReadingFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a=sc.nextInt();
        
      System.out.println("Enter the second number");
      int b=sc.nextInt();
      
      System.out.println("sum is:"+" "+(a+b));
    }

}
