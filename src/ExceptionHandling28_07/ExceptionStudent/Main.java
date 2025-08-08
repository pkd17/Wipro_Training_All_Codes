package ExceptionHandling28_07.ExceptionStudent;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Order o=new Order();
		
		System.out.println("ENter id");
		int orderid=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter order name");
		String orderName=sc.next();
		
		System.out.println("Enter qty");
		int qty=sc.nextInt();
		
		
		try {
			o.setOrderDetails(orderid,orderName,qty);
			System.out.println("order placed");
			
			o.display();
		}
		catch(InvalidOrderException e){
			
			System.out.println(e.getMessage());
			
		}
		sc.close();
	}

}
