package homework3;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		int[] array = {45, 18, 11, 15, 13, 28, 30, 124, 100, 0, 5, 45};
		
		System.out.print("Array is: ");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("Enter number for search: ");
		int number = scn.nextInt();
		
		for(int j = 0; j < array.length; j++){
			for(int i = 0; i < (array.length - 1); i++){
				if(array[i] > array[i + 1]){
					int temp;
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;	
				}
			}
		}
		
		System.out.print("Bubble sort: ");
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		int mean = (array.length / 2) + 1;
		int averageNumber = array[mean - 1];
		
		if(number < averageNumber){
			for(int i = 0; i < mean; i++){
				if(number == array[i]){
					System.out.print("Index: ");
					System.out.println(i);
					break;
				} 
			}
		} else if(number > averageNumber){
			for(int i = mean; i < array.length; i++){
				if(number == array[i]){
					System.out.print("Index: ");
					System.out.println(i);
					break;
				}
			}
		} else{
			System.out.print("Index: ");
			System.out.println(mean - 1);
		} 
		
		scn.close();

	}

}
