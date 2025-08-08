package CoreJava;

public class MethodOverloading {
	//method add with two parameters
	
	public int add(int a, int b) {
		
		int c=a+b;
		 return c;
		 
	}
public int  add(int a, int b, int c) {
		
		int d=a+b+c;
		 return d;
		 
	}
public int add(int a, int b,int c, int d) {
	
	int e=a+b+c+d;
	 return e;
	 
}
public static void main(String[] args) {
	
	MethodOverloading ml=new MethodOverloading();
	System.out.println(ml.add(20, 50));
	System.out.println(ml.add(10, 20, 30));
	System.out.println(ml.add(10, 20, 30,40));
}

}
