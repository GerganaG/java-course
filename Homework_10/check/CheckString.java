package check;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckString {

	public static void main(String[] args) throws InvalidStringException {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.print("Enter string: ");
		String str = scn.nextLine();
		char[] symbol = str.toCharArray();
		scn.close();
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Character> stack = new Stack<Character>();
		
		if(isValid(symbol)){
			for(int i = 0; i < symbol.length; i++){
				if(i == 0 || i % 2 == 0){
					char temp = symbol[i];
					int current = (char) (temp - '0');
					queue.offer(current);
				} else{
					stack.push(symbol[i]);
				}
			}
		} else{
			throw new InvalidStringException("Invalid string!!!");
		}
		System.out.print("Signs in stack: ");
		System.out.println(stack);
		System.out.print("Numbers in queue: ");
		System.out.println(queue);
		
		int num1 = queue.poll();
		int num2 = queue.poll();
		char sign = stack.pop();
		
		System.out.print("Operation: ");
		if(sign == '+'){
			System.out.print("(" + num1 + "+" + num2 + ")" + " = ");
			int sum = num1 + num2;
			System.out.println(sum);
			queue.offer(sum);
		} else if(sign == '-'){
			System.out.print("(" + num1 + "-" + num2 + ")" + " = ");
			int sum = num1 - num2;
			System.out.println(sum);
			queue.offer(sum);
		}
		
		System.out.print("Stack after operation: ");
		while(!stack.isEmpty()){
			char current = stack.pop();		
			System.out.print(current + " ");
		}
		System.out.println();
		System.out.print("Queue after operation: ");
		while (queue.size() > 0) {		
			int current= queue.poll();
			System.out.print(current + " ");	
		}

	}
	
	public static boolean isValid(char[] arr){
		if(arr.length % 2 == 0){
			return false;
		}
		
		for(int i = 0; i < arr.length; i++){
			if(i == 0 || i % 2 == 0){
				for(int j = 0; j < 10; j++){
					if(arr[i] == j){
						continue;
					}
				}	
			} else{
				if(arr[i] == '+' || arr[i] == '-'){
					continue;	
				} else{
					return false;
				}
			}
		}
		return true;
	}

}

