package Lab25_07;

class CurrentAccount implements Account{
	
	double balance;

	public void deposit(double amount) {
            balance=balance+amount;
		
	}

	public void withdraw(double amount) {
		if (amount <= balance)
            balance -= amount;
        else
            System.out.println("not allowed.");
		
	}
	public void Intrest() {
		 System.out.println("No interest for Current Account");
	}

	public void Balance() {
		System.out.println(balance);
	}
	
	
}
