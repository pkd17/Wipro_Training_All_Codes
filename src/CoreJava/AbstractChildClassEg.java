package CoreJava;

public class AbstractChildClassEg extends AbstractClassEg{
	
	@Override
	void makeSound() {
		System.out.println("Animal MAkes Sound");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChildClassEg ab=new AbstractChildClassEg();
		ab.eat();
		ab.makeSound();
		System.out.println(animalName);
	}

}
