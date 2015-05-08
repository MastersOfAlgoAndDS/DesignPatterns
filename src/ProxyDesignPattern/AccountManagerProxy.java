/**
 * 
 */
package ProxyDesignPattern;

/**
 * @author Milind
 *
 */
public class AccountManagerProxy implements IAccountManager {

	private String username;
	private String password;
	AccountManager am = null;
	
	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}


	public AccountManagerProxy(String uname,String pwd){
		username=uname;
		password=pwd;
	}

	/* (non-Javadoc)
	 * @see ProxyDesignPattern.IAccountManager#getRequest()
	 */
	@Override
	public void getRequest() {
		System.out.println("getRequest method in proxy");
		if(username.equalsIgnoreCase("milind") && password.equalsIgnoreCase("mypwd")){
			am = new AccountManager();
			am.getRequest();
		}
		else{
			System.out.println("get out of here!!!");
		}
	}

}
