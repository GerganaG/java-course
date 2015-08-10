package countWords;

import java.util.Scanner;
import java.util.TreeMap;

public class Counter {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		String[] words = new String[20];
		
		System.out.println("Enter 20 words separate with comma: ");
		String text = scn.nextLine();
		words = text.split("[, ]+");
	
		scn.close();
			
		TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();
					
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0; 
			}
			wordsCount.put(word, count + 1);
		}
			
		System.out.println(wordsCount);

	}

}
