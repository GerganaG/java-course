package user;

@SuppressWarnings("serial")
public class MailException extends Exception{
	
	public MailException(){
		super();
	}
	
	public MailException(String message) {
		super(message);
	}
}
