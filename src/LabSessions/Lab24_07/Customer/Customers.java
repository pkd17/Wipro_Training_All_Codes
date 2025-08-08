package Lab24_07.Customer;

public class Customers {
	
	String CustomerName="Satyajit";
	int CustomerId=856;
	String CustDept="Medical";
	
     void Cust() {
		System.out.println("Customer Name is"+ CustomerName);
		System.out.println("Customer Id is"+ CustomerId);
		System.out.println("Customer Dept is"+ CustDept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customers c=new Customers();
          c.Cust();
	}

}
