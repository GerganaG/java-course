package homework4;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter number: ");
		int number = scn.nextInt();
		long result = calculateFac(number);
		System.out.printf("%d! = %d", number, result);
		scn.close();
	}
	
	public static long calculateFac(int n){
		if(n == 0){
			long fac = 1;
			return fac;
		} else{
			return n* calculateFac(n-1);
		}
	}
}
