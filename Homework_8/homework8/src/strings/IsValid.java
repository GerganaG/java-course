package strings;

import java.util.Scanner;

public class IsValid {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter mathematical expression: ");
		String expression = scn.nextLine();
		scn.close();
		
		boolean result = check(expression);
		System.out.printf("Is %s valid - %s ", expression, result);
	}
	
	public static boolean check(String str){
		char[] arr = str.toCharArray();
		
		int countOpen = 0;
		int countClose = 0;
		char open = '(';
		char close = ')';
		
		if(arr[0] == close || arr[arr.length-1] == open){
			return false;
		}
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == open){
				countOpen++;
			} else if(arr[i] == close){
				countClose++;
			}
		}
		
		if(countOpen == countClose){
			return true;
		} else{
			return false;
		}
	}

}
