package CollectionFrameworkJava;


import java.util.*;

public class Student implements Comparable<Student> {
	
	int rollNumber;
	String Name;
	
	//Constructor of the class to pass the parameters
	public Student(int rollNumber, String Name) {
		
		this.rollNumber=rollNumber;
		this.Name=Name;
	}
	public int compareTo(Student s) {
		
		return this.rollNumber-s.rollNumber;
	}
	
	
	public String toString() {
		return rollNumber +" "+ Name;
	}
	
	
	//sort a list of students by roll number (Ascending Order)

	public static void main(String[] args) {
		
		List<Student> students=new ArrayList<>();
		
		students.add(new Student(103,"Ravi"));
		students.add(new Student(101,"Amit"));
		students.add(new Student(102,"Zara"));
		
		Collections.sort(students);
		
		for(Student s:students) {
			System.out.println(s);
		}

	}

}
