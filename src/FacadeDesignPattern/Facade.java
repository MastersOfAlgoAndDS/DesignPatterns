package FacadeDesignPattern;

public class Facade {
	AccountManager acm;
	CodeManager cm;
	BalanceManager bm;
	String code;

	public Facade(String number, String code) {
		acm = new AccountManager(number);
		cm = new CodeManager();
		bm = new BalanceManager();
		this.code = code;
	}

	public void giveMoney(int withdrawAmount) {
		if (acm.checkAccount() && CodeManager.checkSecurityCode(code)
				&& bm.checkBalance(withdrawAmount))
			System.out.println("Withdraw Successful");
		else
			System.out.println("There was an error!");
	}

	public void putMoney(int depositAmount) {
		if (acm.checkAccount() && CodeManager.checkSecurityCode(code)
				&& bm.deposit(depositAmount))
			System.out.println("Deposit Successful");
		else
			System.out.println("There was an error!");

	}
}
