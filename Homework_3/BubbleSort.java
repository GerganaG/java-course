package homework3;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter length of array: ");
		int length = scn.nextInt();
		int[] array = new int[length];
		System.out.println("Enter array: ");
		
		for(int i = 0; i < array.length; i++){
			array[i] = scn.nextInt();
		}
		
		System.out.print("Array: ");
		
		for(int number : array){
			System.out.print(number + " ");
		}
		System.out.println();
		
		for(int j = 0; j < length; j++){
			for(int i = 0; i < (length - 1); i++){
				if(array[i] > array[i + 1]){
					int temp;
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;	
				}
			}
		}
		
		System.out.print("Bubble sort: ");
		
		for(int i = 0; i < length; i++){
			System.out.print(array[i] + " ");
		}
		
		scn.close();

	}

}
