package Lab24_07;

abstract class Vechicle{
	 
	abstract void move();
	
}

class Car extends Vechicle{
	void move() {
		
		System.out.println("Car is moving on four Wheels");
	}
}

class Bike extends Vechicle{
	
	void move() {
		
		System.out.println("Bike is moving on two wheels");
	}
}

class Bus extends Vechicle{
	
	void move() {
		
		System.out.println("Bus is moving with six Wheels");
	}
}
public class AbstractVechicle {
	
	public static void main(String[] args) {
		Vechicle v1=new Car();
		Vechicle v2=new Bike();
		Vechicle v3=new Bus();
		
		v1.move();
		v2.move();
		v3.move();
	}

}
