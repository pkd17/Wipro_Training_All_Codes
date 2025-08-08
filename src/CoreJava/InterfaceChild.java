package CoreJava;

public class InterfaceChild implements Interface1{
	
	public void display() {
		System.out.println("Displaying the interface");
		
	}
	
	
	
	public void read() {
		System.out.println("Reading the interface");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj=new InterfaceChild();
		obj.display();
		obj.read();
		obj.show();
		Interface1.write();
		System.out.println(emp);
		System.out.println(empId);

	}

}
