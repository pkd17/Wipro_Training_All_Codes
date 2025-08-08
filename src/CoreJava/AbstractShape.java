package CoreJava;

abstract class Shape{
	abstract double calculateArea();
}

class Circle extends Shape{
	double radius;
	
	Circle(double r){
		radius=r;
	}
	
	double calculateArea() {
		return 3.14*radius*radius;
	}
}
class Rectangle extends Shape{
	
	double len,wid;
	
	Rectangle(double l,double w){
		len=l;
		wid=w;
	}
	double calculateArea() {
		return len*wid;
	}
}

public class AbstractShape {
   public static void main(String[] args) {
	Circle c=new Circle(5);
	Rectangle r=new Rectangle(12.2,15.8);
	System.out.println(r.calculateArea());
	System.out.println(c.calculateArea());
	
    }
}
