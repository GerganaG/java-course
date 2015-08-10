package uniqueWords;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Unique {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("enter text: ");
		String text = scn.nextLine();
		String[] words = text.split("[, .!?:]+");
		scn.close();
		
		TreeMap<String, Integer> uniqueWords = new TreeMap<String, Integer>();
		
		for (String word : words) {
			Integer count = uniqueWords.get(word);
			if (count == null) {
				count = 0; 
			}
			uniqueWords.put(word, count + 1);
		}
		
		Set<String> keys = uniqueWords.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()){
			String temp = it.next();
			if(uniqueWords.get(temp) == 1){
				System.out.print(temp + " ");
			}
		}
	}

}
