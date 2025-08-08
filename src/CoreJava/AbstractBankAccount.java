package CoreJava;
abstract class BankAccount {
    int accNumber;
    double balance;

    BankAccount(int accNum, double bal) {
        accNumber = accNum;
        balance = bal;
    }

    abstract double calculateInterest(); // ✅ Corrected spelling

    void printBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accNum, double bal) {
        super(accNum, bal);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends BankAccount {
    FixedDepositAccount(int accNum, double bal) {
        super(accNum, bal);
    }

    double calculateInterest() {
        return balance * 0.065;
    }
}

public class AbstractBankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 10000);
        FixedDepositAccount fda = new FixedDepositAccount(102, 20000);

        System.out.println(sa.calculateInterest());
        sa.printBalance();

        System.out.println(fda.calculateInterest());
        fda.printBalance();
    }
}

