package dataStructures2;

import java.util.Scanner;
import java.util.Stack;

public class ReverseSentenceStack {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.print("Enter sentence: ");
		String sentence = scn.nextLine();	
		String[] words = sentence.split("[, .?!:]+");
		Stack<String> stack = new Stack<String>();
		
		for(int i = 0; i < words.length; i++){
			stack.push(words[i]);
		}
		
		System.out.print("Reversed sentece: ");
		while(!stack.isEmpty()){
			String current = stack.pop();
			System.out.print(current + " ");
		}
		
		scn.close();

	}

}
