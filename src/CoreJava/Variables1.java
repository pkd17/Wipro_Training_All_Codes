package CoreJava;

public class Variables1 {
	public String empName="Peter";
	int empId=67754;
	public static String empBU="HR";
	public void fetchempdetails() {
		String empLoc="BBSR";
		System.out.println(empName);
		System.out.println(empId);
		System.out.println(empBU);
	}
	public static void main(String[] args) {
		Variables1 md= new Variables1();
		md.fetchempdetails();
	}

}
