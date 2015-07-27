package homework4;

import java.util.Scanner;

public class SumRecursion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter number [10 - 30 000]: ");
		long number = scn.nextInt();
		if(number >= 10 && number <= 30000){
			long result = sum(number);
			print(result);
		} else{
			System.out.println("Wrong number!");
		}
		scn.close();

	}
	public static long sum(long n){
	
		if(n >= 1 && n <= 30000){
			return n + sum(n-1);	
		} else{
			return 0;
		}
	}
	
	public static void print(long res){
	
			System.out.println("Sum = " + res);
		
	}
}

