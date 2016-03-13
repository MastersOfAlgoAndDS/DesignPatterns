package SingletonDesignPattern;

public class Email {

	private String ontvanger;
	private String verzender;
	private String emailWachtwoord;

	public String getOntvanger() {
		return ontvanger;
	}

	public void setOntvanger(String ontvanger) {
		this.ontvanger = ontvanger;
	}

	public String getVerzender() {
		return verzender;
	}

	public void setVerzender(String verzender) {
		this.verzender = verzender;
	}

	public String getEmailWachtwoord() {
		return emailWachtwoord;
	}

	public void setEmailWachtwoord(String emailWachtwoord) {
		this.emailWachtwoord = emailWachtwoord;
	}

	public Email(String verzender, String emailWachtwoord) {
		setVerzender(verzender);
		setEmailWachtwoord(emailWachtwoord);
	}

	public void print() {
		System.out.println(verzender + ": " + emailWachtwoord);
	}

}