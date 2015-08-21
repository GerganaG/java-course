package dequeue;

import java.util.ArrayList;

public class Deque<T> {

	private ArrayList<T> deque = new ArrayList<T>(); 
	
	public void addAtTheBegining(T number){
		deque.add(0, number);
	}
	
	public void addAtTheEnd(T number){
		deque.add(number);
	}
	
	public void removFromTheBegining(){
		if(deque.isEmpty()){
			System.out.println("Deque is empty!!!");
		} else{
			deque.remove(0);
		}
	}
	
	public void removeFromTheEnd(){
		if(deque.isEmpty()){
			System.out.println("Deque is empty!!!");
		} else{
			deque.remove(deque.size()-1);
		}
	}
	
	public T seeFirst() throws EmptyDequeException{
		if(deque.isEmpty()){
			throw new EmptyDequeException("Deque is empty!!!");
		} else{
			return deque.get(0);
		}
	}
	
	public T seeLast() throws EmptyDequeException{
		if(deque.isEmpty()){
			throw new EmptyDequeException("Deque is empty!!!");
		} else{
			return deque.get(deque.size()-1);
		}
	}
	
	public void printDeque(){
		System.out.println(deque);
	}
	
}
