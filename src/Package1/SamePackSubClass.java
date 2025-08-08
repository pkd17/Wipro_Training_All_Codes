package Package1;

public class SamePackSubClass extends Class1 {
	
	public void read() {
		System.out.println("Reading in sub class");
	}

	public static void main(String[] args) {
		
		SamePackSubClass sp=new SamePackSubClass();
		sp.display();
		sp.read();
		sp.emp();
		sp.stu();
		// TODO Auto-generated method stub

	}

}
