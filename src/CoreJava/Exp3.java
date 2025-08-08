package CoreJava;

public class Exp3 {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
          Exp3 e1=new Exp3();
          ParametrizedMethods p=new ParametrizedMethods();
          e1.add(100,30);
          e1.sub(100, 10);
          p.mul(10, 5);
          p.div(100, 5);
	}

}
