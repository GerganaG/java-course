package strings;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter text: ");
		String text = scn.nextLine();
		System.out.println("Enter word in lower case: ");
		String word = scn.nextLine();
		scn.close();
		int counter = 0;
		String newText = text.toLowerCase();
		
		int index = newText.indexOf(word);
		while(index != -1){
			counter++;
			index = newText.indexOf(word, index + 1);
		}
		System.out.println("Number of words: " + counter);
		
	}

}
