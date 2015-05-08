package FacadeDesignPattern;

/**
 * @author Milind This class has the job to manage the balance
 */
public class BalanceManager {
	int balance = 1000;

	public boolean checkBalance(int amount) {
		if (amount > balance)
			return false;
		return true;
	}

	public boolean withdraw(int amount) {
		if (checkBalance(balance - amount)) {
			System.out.println("Not enough balance");
			return false;
		} else {
			setBalance(balance - amount);
			return true;
		}

	}

	public boolean deposit(int amount) {
		setBalance(balance + amount);
		return true;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
