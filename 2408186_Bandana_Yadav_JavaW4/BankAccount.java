package workshop4;

public class BankAccount {
	double balance = 0.0;
	
	double deposit(double amount) {
		if (amount > 0) {
			balance = balance+amount;
		}
		return balance;
		
	}
	
	double withdraw(double amount) {
		if (balance < amount) {
			return balance;
		}
		balance -= amount;
		return balance;
	}
}
