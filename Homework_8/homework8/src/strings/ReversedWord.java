package strings;

import java.util.Scanner;

public class ReversedWord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.print("Enter word: ");
		String word = scn.nextLine();
		scn.close();
		
		String reverseWord = reverse(word);
		System.out.println("Reversed word: " + reverseWord);

	}
	
	public static String reverse(String word){
		StringBuilder sb = new StringBuilder();
		for(int i = word.length() - 1; i >= 0; i--){
			sb.append(word.charAt(i));
		}
		return sb.toString();
	}
}
