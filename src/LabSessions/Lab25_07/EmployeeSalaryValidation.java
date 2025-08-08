package Lab25_07;

class Employee {
	
	private String name;
	private int id;
	private double salary;
	
	public Employee( String name,int id,double salary) {
		this.name=name;
		this.id=id;
		setSalary(salary);
		
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalery() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary=salary;
			
		}
		else {
			System.out.println("invalid id"+id+"salary must be positive");
			this.salary=0;
		}
	}
	
    public void Display() {
      System.out.println("Employee name"+name);
      System.out.println("Employee Id"+id);
      System.out.println("Employee salary"+salary);
      
    }
    
}
public class EmployeeSalaryValidation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee e1= new Employee("Sujit",546,45000.00);
          Employee e2= new Employee("Rakesh",548,-48000.00);
          Employee e3= new Employee("Suhail",549,49000.00);
          
          e1.Display();
          e2.Display();
          e3.Display();
	}

}
