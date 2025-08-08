package ExceptionHandling28_07;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
	    try {
	    	String S1=null;
	    	System.out.println(S1.length());
	    }
	    catch(Exception e) {
	    	System.out.println(e);
	    	
	    }

	}

}
