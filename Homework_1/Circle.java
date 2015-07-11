import java.util.Scanner;

public class Circle {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		int r;
		float s, p;
		
		System.out.println("Enter radius: ");
		r = input.nextInt();
		
		s = 3.14f * r * r;
		p = 2f * 3.14f * r;
		
		System.out.println("Area is: " + s);
		System.out.println("Circumference is: " + p);
		
		input.close();
	}

}
