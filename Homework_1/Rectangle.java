import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		int length, width;
		
		System.out.println("Enter length of rectangle: ");
		length = input.nextInt();
		
		System.out.println("Enter width of rectangle: ");
		width = input.nextInt();
		
		int s = length * width;
		System.out.print("length * width = ");
		System.out.println(s);
		
		input.close();
			

	}

}
