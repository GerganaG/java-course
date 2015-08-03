package user;

@SuppressWarnings("serial")
public class PassException extends Exception {
	
	public PassException(){
		super();
	}

	public PassException(String message) {
		super(message);
	}
	
}
