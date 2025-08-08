package Package2;
import Package1.Class1;

public class DiffPackNonSubClass {
	public void print() {
		System.out.println("Printing the Data");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Class1 obj= new Class1();
             
             DiffPackNonSubClass obj1=new  DiffPackNonSubClass();
             
             obj.display();
             obj1.print();
             //obj1.stu();
             
             //obj.emp();
	}

}
