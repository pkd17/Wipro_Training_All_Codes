package CoreJava;

class MyClass implements InterfaceA, InterfaceB{
	
	public void display() {
		
		System.out.println("Displaying the Data");
	}
	
}
public class InterfaceClass {

	public static void main(String[] args) {
		
		MyClass obj=new MyClass();
		obj.display();
		InterfaceA.display();
		InterfaceB.display();

	}

}
