import java.util.Scanner;

public class Card {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Въведете карта: ");
		String str = scn.nextLine();
		
		switch(str){
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "10":
			case "J":
			case "Q":
			case "K":
			case "A": 
				System.out.println("Валидна карта!"); break;
			default: 
				System.out.println("Невалидна карта!");
		
		}
		
		scn.close();

	}

}
