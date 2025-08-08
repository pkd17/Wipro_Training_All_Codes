package CoreJava;

public class StaticVariable {
	
	public static String sName="Pratyush";
	public String college="NIST University";
	public static int sid=78;
	

	public static void main(String[] args) {
		// accessing of Static variables
      System.out.println(sName);
      System.out.println(sid);
      //accessing of non static variables
      StaticVariable sb= new StaticVariable();
      System.out.println(sb.college);
	}

}
