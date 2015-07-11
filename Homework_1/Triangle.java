import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		int a, h, S;
		
		System.out.println("Enter side of the triangle: ");
		a = input.nextInt();
		
		System.out.println("Enter height to the side of the triangle: ");
		h = input.nextInt();
		
		S = (a * h) / 2;
		System.out.println("(a * h) / 2 = " + S);
		
		input.close();

	}

}
