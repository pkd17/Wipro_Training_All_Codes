package Lab24_07.Company;

public class Employees {
	
	public String EmpName="Sidharth";
	public int EmpId=887;
	public String Empdept="Testing";
	public void emp() {
		System.out.println("Employee NAme is:"+ EmpName);
		System.out.println("Employee Id is:"+ EmpId);
		System.out.println("Employee Dept is:"+ Empdept);
		
	}
	public static void main(String[] args) {
		
		Employees e=new Employees();
		e.emp();
		// TODO Auto-generated method stub

	}

}
