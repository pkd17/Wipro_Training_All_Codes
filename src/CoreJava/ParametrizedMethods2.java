package CoreJava;

public class ParametrizedMethods2 {
	public void add() {
		int a= 8;
		int b= 10;
		int c=a+b;
		
		System.out.println(c);
	}
	public void add1(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametrizedMethods2 pm=new ParametrizedMethods2();
		pm.add1(52, 50);
		pm.add1(48, 78);
		pm.add();
		pm.add1(-9, -20);

	}

}
