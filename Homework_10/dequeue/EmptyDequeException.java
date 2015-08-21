package dequeue;

@SuppressWarnings("serial")
public class EmptyDequeException extends Exception{

	public EmptyDequeException(){
		super();
	}
	
	 public EmptyDequeException(String message) {
        super(message);
     }
}
