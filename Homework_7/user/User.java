package user;

public class User {

	protected String mail;
	protected String pass;
	private String[] numbers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

	public User() {
		this.mail = "";
		this.pass = "";
	}

	public User(String mail, String pass) throws MailException, PassException {
		setMail(mail);
		setPass(pass);
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) throws MailException {

		if (mail.length() < 5 || !mail.contains("@") || !mail.contains(".")) {
			throw new MailException("Invalid mail address!!!");
		} else{
			System.out.println("Valiv mail adress!");
		}
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) throws PassException {
		
		if(pass.length() < 6 || isPassContainsNumber(pass)){
			throw new PassException("Invalide password!!!");
		} else{
			System.out.println("Valid password!");
		}
		this.pass = pass;
	}

	public boolean isPassContainsNumber(String pass) {
		for (int i = 0; i < numbers.length; i++) {
			if (pass.contentEquals(numbers[i])) {
				return true;
			}
		}
		return false;
	}

}
