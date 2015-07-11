import java.util.Scanner;

public class RemainderOperator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		int a, b, c;
		
		System.out.println("Enter 2 integers (everyone of them on new line): ");
		a = input.nextInt();
		b = input.nextInt();
		
		c = a % b;
		
		System.out.println("Remainder is: " + c);
		
		input.close();
		
	}

}
