import java.util.Scanner;

public class SwitchConstruct {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter integer: ");
		int num = scn.nextInt();
		
		switch(num){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: 
				if(num % 2 == 0){
					System.out.println("Number " + num + " is Even");
				} else{
					System.out.println("Number " + num + " is Odd");
				}; 
				break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				boolean result = (num % 3 == 0);
				System.out.println("Is number " + num + " devided by 3 without residue? -  " + result);
				break;
			default: 
				if(num == 0){
					System.out.println("Number is zero!");
				} else if(num < 0){
					System.out.println("Negative number!");
				} else{
					System.out.println("Positive number!");
				}
		}
		
		scn.close();

	}

}
