package FacadeDesignPattern;

public class FacadeClient {
	public static void main(String[] args) {
		Facade f = new Facade("123456789", "1234");
		f.giveMoney(1001);
		f.giveMoney(200);
		f.putMoney(400);
	}
}
