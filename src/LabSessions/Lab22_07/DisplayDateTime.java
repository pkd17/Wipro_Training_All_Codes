package Lab22_07;
/*10.Write a Java program to display system time.
Sample Output:
Current Date time: Fri Jun 16 14:17:40 IST 2017 
*/
import java.util.Date;

public class DisplayDateTime {

	public static void main(String[] args) {
		 Date currentDate=new Date();
		 System.out.println("Current Date time:"+currentDate);
	}

}
