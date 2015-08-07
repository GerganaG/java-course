package strings;

import java.util.Scanner;

public class SearchingInStrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter sentence: ");
		String sentence = scn.nextLine();
		scn.close();
		
		boolean startsWith = sentence.startsWith("Greeting");
		System.out.format("The sentence begins wit the word \"Greeting\": %s \n", startsWith);
		
		boolean endsWith = sentence.endsWith(".");
		System.out.format("The sentence ends with \".\": %s \n", endsWith);
		
		boolean contains = sentence.contains("water");
		System.out.format("The sentence contains the word \"water\": %s \n", contains);
	}

}
