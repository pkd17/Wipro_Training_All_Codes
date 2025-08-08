package CoreJava;

public class Circle1  implements CircleShape{
	

@Override
public void draw() {
	System.out.println("Drawing the Circle");
}

@Override
public void radius() {
	System.out.println("Radius is 5");
	
}
	
	

	public static void main(String[] args) {
		Circle1 c=new Circle1();
		c.draw();
		c.radius();

}
	}
