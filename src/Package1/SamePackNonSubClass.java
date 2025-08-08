package Package1;

public class SamePackNonSubClass {
	public void test() {
		System.out.println("All Pass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamePackNonSubClass nw=new SamePackNonSubClass();
		nw.test();
		
		Class1 cs= new Class1();
		cs.display();
		
		cs.emp();
		cs.stu();
	}

}
