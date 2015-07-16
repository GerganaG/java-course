import java.util.Scanner;

public class SumOfIntegers {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		int num;
		int sum = 0;
		do {
			System.out.println("Enter numbers: ");
			num = scn.nextInt();
			sum += num;
			System.out.println("Sum = " + sum);
		} while (num != 0);
		
		scn.close();
	}
}
