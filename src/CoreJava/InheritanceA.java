package CoreJava;

public class InheritanceA {
	
	String m="Hirerchical";
	
	public void inhe1() {
		
		System.out.println("Inheritence Type:" + m);
	}
	
	class B extends InheritanceA{
		String n="It is class of B";
		
		public void displayB() {
			System.out.println("Class of"+n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
