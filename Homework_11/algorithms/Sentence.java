package algorithms;

import java.util.Scanner;

public class Sentence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.print("Enter sentecnce: ");
		String sentence = scn.nextLine();
		String[] words = sentence.split("[, .!?:\"\"]+");
		scn.close();
		
		String[] sortedString = sort(words);
		
		System.out.print("Sort: ");
		for (String string : sortedString) {
			System.out.print(string + " ");
		}
		
		MergeSortSentence.mergeSort(words);
		
		System.out.print("\nMerge sort: ");
		for (String string : words) {
			System.out.print(string + " ");
		}
	}
	
	public static String[] sort(String[] array){
		for(int j = 0; j < array.length; j++){
			for(int i = 1; i < array.length; i++){
				if(array[i-1].trim().compareToIgnoreCase(array[i].trim()) > 0){
					String temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
				}
			}
		}	
		
		return array;
	}

}
