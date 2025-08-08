package ExceptionHandling28_07.ExceptionStudent;

public class Order {
	private int orderid;
	private String itemName;
	private int qty;
	
	public void setOrderDetails(int orderid,String itemName,int qty) throws InvalidOrderException{
		if(orderid<1000) {
			
			throw new InvalidOrderException("Id must be 4 digits");
			
		}
		if(itemName==null) {
			throw new InvalidOrderException("Cant be empty");
			
			
			
		}
		if(qty<=0) {
			
			throw new InvalidOrderException("qty more than 0");
		}
		
		this.orderid=orderid;
		this.itemName=itemName;
		this.qty=qty;
		
	}
	
	public void display() { 
		
		System.out.println(orderid);
		System.out.println(itemName);
		System.out.println(qty);
	}
	

}
