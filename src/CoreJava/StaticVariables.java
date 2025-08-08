package CoreJava;

public class StaticVariables {
	public static String StuName="Pratyush";
	public String College="NIST University";
	public static int stuId=787;
	public static void main(String[] args) {
		StaticVariables sv= new StaticVariables();
		System.out.println(StuName);
		System.out.println(stuId);
		System.out.println(sv.College);
	}

}
