package check;

@SuppressWarnings("serial")
public class InvalidStringException extends Exception{

	public InvalidStringException(){
		super();
	}
	
	 public InvalidStringException(String message) {
        super(message);
     }
}
