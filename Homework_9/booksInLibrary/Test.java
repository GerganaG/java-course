package booksInLibrary;

import java.util.ArrayList;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {


		Book firstBook = new Book("The Hunger Games", "Suzanne Collins", 200);
		Book secondBook = new Book("Pride and Prejudice", "Jane Austen", 900);
		
		ArrayList<Book> firstList = new ArrayList<>();
		firstList.add(firstBook);
		
		ArrayList<Book> secondList = new ArrayList<>();
		secondList.add(secondBook);
		
		TreeMap<String, ArrayList<Book>> firstMap = new TreeMap<>();
		firstMap.put("The Hunger Games", firstList);
		firstMap.put("Pride and Prejudice", secondList);
		
		
		Library first = new Library("Prosveta", "Montana", firstMap);
		System.out.println(first);
		
		first.addCopy("The Hunger Games");	
		first.addCopy("The Hunger Games");
		first.removeCopy("The Hunger Games");
		first.addCopy("Pride and Prejudice");
		first.removeCopy("Pride and Prejudice");
		first.removeCopy("Pride and Prejudice");
		first.addCopy("Programming");
		first.removeCopy("Gone with the Wind");
		
		System.out.println(first);
		
		

		
		
	}

}
