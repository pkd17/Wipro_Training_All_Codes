package CoreJava;

public class Exp2 {
	
	public void area(double r) {
		System.out.println(3.14*r*r);
	}

	public static void main(String[] args) {
			Exp2 e=new Exp2();
			System.out.println("Radius of the circle is");
			e.area(20.52);
	}

}
