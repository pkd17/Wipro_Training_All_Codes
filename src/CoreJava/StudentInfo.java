package CoreJava;

public class StudentInfo {
	
	public void stuInfo(String name, int rollno, String branch) {
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(branch);
	}
	public static void main(String[] args) {
		StudentInfo si=new StudentInfo();
		si.stuInfo("Pratyush",78,"CSE");
	}

}
