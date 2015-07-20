package homework3;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter length or array: ");
		int length = scn.nextInt();
		int[] array = new int[length];
		System.out.println("Enter array: ");
		
		for(int i = 0; i < length; i++){
			array[i] = scn.nextInt();
		}
		
		System.out.println("Enter number for search: ");
		int number = scn.nextInt();
		
		for(int i = 0; i < length; i++){
			if(array[i] == number){
				System.out.println("Index: " + i);
				break;
			} if(i == (length - 1) && i != number){
				System.out.println("Number is not found!");
			}
		}
		
		scn.close();

	}

}
