package ExceptionHandling28_07;

public class CustomExceptionEg {
	
	public void checkage(int age) throws Exception {
		if(age<18) {
			System.out.println("Create a new Exception");
			
			//using throw keyword
			throw new Exception("Age must be 18 or 18+ to vote");		
		}else {
			System.out.println("Person is not eligible for voting");
		}
	}

	public static void main(String[] args) throws Exception {
		
		CustomExceptionEg obj=new CustomExceptionEg();
		
		obj.checkage(15);
				
	}

}
