package CoreJava;

public class LocalVariables {
	public void add() {
		//local variable not accessible from outside the method.
		int a=8;
		int b=9;
		int c=a+b;
		
		//Static String s1="Pkd";
		System.out.println(c);
		
		
	}
	/*public void add1() {
		System.out.println(c);
	}*/

	public static void main(String[] args) {
		LocalVariables l=new LocalVariables();
		l.add();

	}

}
