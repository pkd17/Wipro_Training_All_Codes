package CollectionFrameworkJava;

import java.util.*;

public class ComparatorSubClass implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
    	
    	return e2.name.compareTo(e1.name);
    }
	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<>();		
		
		employees.add(new Employee(103,"Ravi"));
		employees.add(new Employee(101,"Amit"));
		employees.add(new Employee(102,"Zara"));
		employees.add(new Employee(102,"Zara"));
		employees.add(new Employee(103,"Ravi"));
		
		
		Collections.sort(employees,new ComparatorSubClass());
		
		for(Employee e: employees) {
			System.out.println(e);
		}

	}

}
