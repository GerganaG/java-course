package homework3;

import java.util.Scanner;

public class SymmetricArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter length of array: ");
		int length = scn.nextInt();
		int[] array = new int[length];
		boolean result = true;
		System.out.println("Enter array: ");
		
		for(int i = 0; i < length; i++){
				array[i] = scn.nextInt();
		}
		
		for(int i = 0; i < (length + 1) / 2; i++){
			if(array[i] == array[length - i - 1]){	
			} else{
				result = false;
			} 
		}
		
		if(result == true){
			System.out.println("Symmetric array!");
		} else{
			System.out.println("Array is not symmetric!");
		}
		
		scn.close();

	}

}
