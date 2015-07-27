package homework4;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter 3 inegers: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int max = maxNumber(maxNumber(a, b), c);
		System.out.println("Max number is: " + max);
		
		scn.close();

	}
	
	public static int maxNumber(int num1, int num2){
		if(num1 > num2){
			return num1;
		} else if(num2 > num1){
			return num2;
		} else{
			return num1;
		}
	}

}
