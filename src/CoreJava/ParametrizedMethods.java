package CoreJava;

public class ParametrizedMethods {
	
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	public void mul(int a, int b) {
		System.out.println(a*b);
	}
	public void div(int a, int b) {
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		
        ParametrizedMethods p=new ParametrizedMethods();
        p.add(100, 30);
        p.sub(100, 50);
        p.mul(100,5);
        p.div(100, 20);
	}

}
