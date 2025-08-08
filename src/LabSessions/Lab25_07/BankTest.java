package Lab25_07;

public class BankTest {

	public static void main(String[] args) {
		
		SavingAccount sa=new SavingAccount();
		CurrentAccount ca=new CurrentAccount();
		
		sa.deposit(5698);
		ca.deposit(50000);
		sa.withdraw(500);
		ca.withdraw(2000);
		
		sa.Intrest();
		sa.Balance();
		ca.Intrest();
		ca.Balance();

	}

}
