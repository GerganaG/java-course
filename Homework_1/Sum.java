import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		int a, b, c, d, Sum;
		
		System.out.println("Enter 4 integers (everyone of them on new line): ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		
		Sum = a + b + c + d;
		System.out.println("Sum is: " + Sum);
		
		input.close();
	}

}
