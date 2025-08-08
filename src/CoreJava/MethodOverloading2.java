package CoreJava;

public class MethodOverloading2 {
	
	
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public double add(double m, double n) 
	{
		double o=m+n;
		return o;
	}
	

	public static void main(String[] args) {
		
		MethodOverloading2 mo=new MethodOverloading2();
		System.out.println(mo.add(20.31, 85.23));
		System.out.println(mo.add(50, 100));
		
	}

}