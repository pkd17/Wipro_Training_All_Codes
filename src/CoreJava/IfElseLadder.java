package CoreJava;

public class IfElseLadder {
	public static void main(String[] args) {
		String branch="MG Road";
		
		if(branch== "Richmond Circle") {
			
			System.out.println("Deposit Scheme is Avilable");
			
		}else if(branch=="MG Road") {
			System.out.println("Loan plan is avilable");
		}
		else if(branch=="Majestic") {
			System.out.println("Insurance is avilable");
			
		}else {
			System.out.println(branch);
		}
	}

}
