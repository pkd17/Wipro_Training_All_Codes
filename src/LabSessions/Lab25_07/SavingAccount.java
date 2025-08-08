package Lab25_07;

class SavingAccount implements Account {
	
	double balance;
	double intRate=0.4;
	
	public void deposit(double amount) {
		balance=balance+amount;
	}
	
	public void withdraw(double amount) {
		if(amount<=balance)
		{
			balance=balance-amount;
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}

	@Override
	public void Intrest() {
		double intrest= balance*intRate;
		balance=balance+intrest;
	}

	@Override
	public void Balance() {
		
		System.out.println(balance);
	}

}
