package CollectionFrameworkJava;
 
import java.util.*;

public class Employees implements Comparable<Employees> {
	int empId;
	String Name;
	
	//Constructor of the class to pass the parameters
	public Employees(int empId, String Name) {
		
		this.empId=empId;
		this.Name=Name;
	}
	public int compareTo(Employees e) {
		
		 return this.Name.compareTo(e.Name);
	}
	
	
	public String toString() {
		return empId +" "+ Name;
	}
	
	
	//sort a list of Employeess by Alphabetical number (Ascending Order)

	public static void main(String[] args) {
		
		List<Employees> employeess=new ArrayList<>();
		
		employeess.add(new Employees(103,"Ravi"));
		employeess.add(new Employees(101,"Amit"));
		employeess.add(new Employees(102,"Zara"));
		
		Collections.sort(employeess);
		
		for(Employees e:employeess) {
			System.out.println(e);
		}

	}
}
