package bank;

@SuppressWarnings("serial")
public class NegativeMoneyException extends Exception{

	public NegativeMoneyException(){
		super();
	}
	
	public NegativeMoneyException(String message) {
		super(message);
	}
	
}
