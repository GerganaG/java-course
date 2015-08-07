package strings;

import java.util.Scanner;

public class SentenceWithSpecificWord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter text: ");
		String text = scn.nextLine();
		System.out.println("Enter word for search: ");
		String word = scn.nextLine();
		scn.close();
		String newText = text.toLowerCase();
		String[] sentences = newText.split("[.!?]+");
		
		for (int i = 0; i < sentences.length; i++) {
			int index = sentences[i].indexOf(word);
			if(index != -1){
				System.out.print(sentences[i] + ".");
			}
		}

	}

}
