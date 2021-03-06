package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		int n = 10;
		int[] numbers = new int[n];
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < n; i++){
			numbers[i] = scn.nextInt();
		}
		System.out.print("Array of numbers: ");
		print(numbers);
		System.out.println();

		scn.close();
		
		int odd = 0;
		int even = 0;
		ArrayList<Integer> oddList = new ArrayList<>();
		ArrayList<Integer> evenList = new ArrayList<>();
		
		for(int j = 0; j < numbers.length; j++){
			if(numbers[j] % 2 == 0){
				evenList.add(numbers[j]);
				even++;
			} else{
				oddList.add(numbers[j]);
				odd++;
			}
		}	

		int[] oddArray = new int[odd];
		int[] evenArray = new int[even];
		
		for(int k = 0; k < evenList.size(); k++){
			evenArray[k] = evenList.get(k);
		}
		
		for(int l = 0; l < oddList.size(); l++){
			oddArray[l] = oddList.get(l);
		}
		
		System.out.print("Even: ");
		print(evenArray);
		System.out.print("\nOdd: ");
		print(oddArray);
		
		System.out.print("\nSorted Odd: ");
		QuickSortInDescendingOrder.quickSortInDescendingOrder(oddArray, 0, oddArray.length - 1);
		print(oddArray);
		
		int maxValueEven = BucketSort.maxValue(evenArray);
		System.out.print("\nSorted Even: ");
		BucketSort.printSequence(BucketSort.sort(evenArray, maxValueEven));
	}
	
	public static void print(int[] arr){
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
