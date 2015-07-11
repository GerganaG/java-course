import java.util.Scanner;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		int a;
		
		System.out.println("Enter integer: ");
		a = input.nextInt();
		
		System.out.println("Is (a = " + a + ") even? : " + (a % 2 == 0));
			
		input.close();
	
	}

}
