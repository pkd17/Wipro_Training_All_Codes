package CoreJava;

abstract class AbstractClassEg {
	
	abstract void makeSound(); 
	
	
	void eat() {
		System.out.println("The animal eats food");
	}
	
	AbstractClassEg(){
		System.out.println("Creating constructor in Abstraction");
	}
	//instance variables
	
	public static String animalName="Lion";
	
	//final variable
	private final String animalBeha="Roar";
	
	

}
