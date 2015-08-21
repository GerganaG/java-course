package dequeue;

public class TestDeque {

	public static void main(String[] args) throws EmptyDequeException{
		
		Deque<Integer> newDeque = new Deque<Integer>();
		
		newDeque.addAtTheBegining(10);
		newDeque.addAtTheEnd(15);
		newDeque.addAtTheEnd(3);
		newDeque.addAtTheBegining(2);
		newDeque.printDeque();
		System.out.println();
		 
		int first = newDeque.seeFirst();
		int last = newDeque.seeLast();
		System.out.printf("First element is %d\n", first);
		System.out.printf("Last element is %d\n", last);
		newDeque.printDeque();
		System.out.println();
		
		newDeque.removFromTheBegining();
		newDeque.printDeque();
		newDeque.removeFromTheEnd();
		newDeque.printDeque();

	}

}
