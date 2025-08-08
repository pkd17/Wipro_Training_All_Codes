package Package2;

import Package1.Class1;

public class DiffPackSubClass extends Class1{
	public void disp() {
		
		System.out.println("Display");
	}

	public static void main(String[] args) {
		DiffPackSubClass df=new DiffPackSubClass();
		df.disp();
		df.display();
		df.stu();
		//df.emp();
		
              
	}

}
