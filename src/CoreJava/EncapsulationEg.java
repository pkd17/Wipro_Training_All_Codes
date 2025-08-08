package CoreJava;

public class EncapsulationEg {
	
	private String name;
	private int age;
	
	//public getter method for name
	
	public String getName() {
		return name;
	}
	
	//public setter method for name
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
     
	public void setAge(int age) {
		
		this.age=age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationEg e=new EncapsulationEg();
		e.setAge(49);
		e.setName("shovan");
		
		System.out.println(e.getName());
		System.out.println(e.getAge());
	}

}
