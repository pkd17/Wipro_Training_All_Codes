package Package1;

public class Class1 {
	
	
	//Protected
	
	protected static int stuId= 129;
	
	protected void stu() {
		System.out.println("Student id is:"+stuId);
	}
	
	//Default
	
	int empId=778;
	
	void emp() {
		System.out.println("Employee ID is:"+empId);
	}
	
	
	
	//Private Variable
	private static String employeeSal="456789";
	
	//Private Method
	private void fetchsalary() {
		System.out.println("Employee Salary is:"+ employeeSal);
	}
	
	
	//Public Method
	public void display() {
		System.out.println("Display the data");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class1 obj=new Class1();
		obj.display();
		obj.fetchsalary();
		obj.emp();
		obj.stu();

	}

}
