package ProxyDesignPattern;

public class ProxyTester {
	public static void main(String[] args) {
		IAccountManager proxy = new AccountManagerProxy("milind", "mypwd");
		proxy.getRequest();
		
		proxy = new AccountManagerProxy("milind", "milind");
		proxy.getRequest();
	}
}
