package CoreJava;

public class SingleInChildClass2 extends SingleInChildClass{
	String Location="Bhubaneswar";
	
	public void loc() {
		System.out.println("Model name is"+ model);
		System.out.println("Laction is:"+Location);
	}
	public static void main(String[] args) {
		SingleInChildClass2 obj2=new SingleInChildClass2();
		obj2.loc();
		obj2.display();
	}

}
