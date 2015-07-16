import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter result [1-9]: ");
		int a = scn.nextInt();
		int sum;
		
		switch(a){
		case 1:
		case 2:
		case 3: sum = a * 5;
			System.out.println("Result + Bonus = " + sum); break;
		case 4:
		case 5: 
		case 6: sum = a * 10;
			System.out.println("Result + Bonus = " + sum); break;
		case 7:
		case 8:
		case 9: sum = a * 50;
			System.out.println("Result + Bonus = " + sum); break;
		default: System.out.println("Wrong result!"); 
		
		}
		
		scn.close();

	}

}
