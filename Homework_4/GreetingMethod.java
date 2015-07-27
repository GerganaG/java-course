package homework4;

import java.util.Scanner;

public class GreetingMethod {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter your name: ");
		String name = scn.nextLine();
		
		printName(name);
		
		scn.close();

	}
	
	public static void printName(String str){
		System.out.printf("Greeting, %s!", str);
	}

}
