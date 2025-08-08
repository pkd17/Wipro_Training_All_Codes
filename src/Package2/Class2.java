package Package2;

import Package1.Class1;

public class Class2 {
	public void play() {
		System.out.println("Pronting the data");
	}
	
	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.display();
		Class2 obj1=new Class2();
		obj1.play();
	}

}
