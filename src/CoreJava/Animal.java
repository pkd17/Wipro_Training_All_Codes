package CoreJava;
//SuperClass
class An {
	
	public void eat() {
		System.out.println("Animals eat food");
	}
}
//SubClass1

class Dog extends An{
	
	public void bark() {
		System.out.println("Dog Barks");
	}
}

//SubClass2
class cat extends An{
	public void meow() {
		System.out.println("Cat meow");
	}

}


class cow extends An{
	public void moo() {
		System.out.println("cow moo");
	}

}

//main Class
public class Animal{
	 public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();
		cat c=new cat();
		c.eat();
		c.meow();
		cow w=new cow();
		w.eat();
		w.moo();
		 
	}
 }