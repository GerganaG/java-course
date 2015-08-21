package dataStructures2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RemoveWordsQueue {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.print("Enter sentence: ");
		String sentence = scn.nextLine();	
		String[] words = sentence.split("[, .?!:]+");
		Queue<String> queue = new LinkedList<String>();
		
		for(int i = 0; i < words.length; i++){
			if(words[i].length() > 3){
				queue.offer(words[i]);
			}
		}
		
		System.out.print("New sentence: ");
		while(queue.size() > 0){
			String current = queue.poll();
			System.out.print(current + " ");
		}
		
		scn.close();
	}

}
