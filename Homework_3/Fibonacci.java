package homework3;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter length: ");
		int n = scn.nextInt();
		long[] arr = new long[n];	
		
		for(int i = 0; i < arr.length; i++){
			if(i == 0){
				arr[i] = 0;
			} else if(i == 1){
				arr[i] = 1;
			} else {
				arr[i] = arr[i-1] + arr[i-2];
			}
				
		}
		
		System.out.print("Fibonacci numbers = {");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.print("}");
		
		
		
		scn.close();
		
	}

}
