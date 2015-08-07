package strings;

import java.util.Scanner;

public class ReplaceWord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter word in lower case: ");
		String word = scn.nextLine();
		System.out.println("Enter text in lower case: ");
		String text = scn.nextLine();
		scn.close();
		
		String newWord = word.toUpperCase();
		System.out.println(newWord);
		
		String newText = text.replace(word, newWord);
		System.out.println("New text: " + newText);
	}

}
