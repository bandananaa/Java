package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testDeposit() {
		BankAccount b1 = new BankAccount();
		assertEquals(100,b1.deposit(100));
		System.out.println("Deposited amount is: "+b1.balance);
	}
	
	@Test
	void testWithdraw() {
		BankAccount b1 = new BankAccount();
		b1.deposit(100);
		assertEquals(50,b1.withdraw(50));
		System.out.println("Withdrawn amount is: "+b1.balance);
	}
	
	@Test
	void testWithdraw2() {
		BankAccount b1 = new BankAccount();
		b1.deposit(100);
		b1.withdraw(50);
		assertEquals(50,b1.withdraw(60));
		System.out.println("Withdrawn amount is(Insufficient): "+b1.balance);
	}

}
