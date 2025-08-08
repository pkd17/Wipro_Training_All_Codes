package ExceptionHandling28_07;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		try {
			
			int a=100;
			int b=0;
			int c=a/b;
			
			System.out.println(c);
			
			String s=null;
			System.out.println(s.length());
		} 
		catch(Exception e) {
			
			//print the trace of the exception
			
			System.out.println(e);
		}
		finally {
			//closing of the browsers
			//closing of the database connection
			//closing of Scanner classes
			//Api connection closing
			System.out.println("This is a mendated code");
		}
		

	}

}
