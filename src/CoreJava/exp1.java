package CoreJava;

public class exp1 {
	
	public int a=100;
	public int b=20;
	
	
	public void add()
	{
		System.out.println(a+b);
	}
	public void sub()
	{
		System.out.println(a-b);
	}
	public void mul()
	{
		System.out.println(a*b);
	}
	public void div()
	{
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       exp1 e=new exp1();
       e.add();
       e.sub();
       e.mul();
       e.div();
	}

}
