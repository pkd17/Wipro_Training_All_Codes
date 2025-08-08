package Lab24_07.Company;


public class SameCompSubClass extends Employees{

	public void read() {
		System.out.println("Reading in sub class");
	}

	public static void main(String[] args) {
		
		SameCompSubClass sp=new SameCompSubClass();
		
		sp.emp();
	
		// TODO Auto-generated method stub

	}
}
