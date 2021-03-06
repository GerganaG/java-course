package homework4;

import java.util.Scanner;

public class PermutationRecursion {
	
	public static int number;
	public static int[]arr;
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter number: ");
		number = scn.nextInt();
		
		arr = new int[number];
		for(int i = 0; i < number; i++){
			arr[i] = i+1;
		}
		
		System.out.println("Arr: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("Permutation: ");
		
		printCombination(arr);
		
		scn.close();

	}
	
	public static void printCombination(int[] array){
		permutation(array, 0, array.length-1);
	}
	
	public static void permutation(int[] a, int firstIndex, int lastIndex){
		if(lastIndex - firstIndex == 0){
			print(a);
		} else if(lastIndex - firstIndex == 1){
	 			print(a);
	 			swap(firstIndex, lastIndex, a);
	 			print(a);
	 			swap(firstIndex, lastIndex, a);
			} else{
				for(int i = firstIndex, j = 0; i <= lastIndex; i++, j++){
					swap(firstIndex, firstIndex+j, a);
					
					permutation(a, firstIndex+1, lastIndex);
					
					swap(firstIndex, firstIndex+j, a);
				}
			}	
	}
	
	public static void print(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void swap(int firstIndex, int lastIndex, int[] a){
		int temp = a[lastIndex];
		a[lastIndex] = a[firstIndex];
		a[firstIndex] = temp;
	}
		
}

