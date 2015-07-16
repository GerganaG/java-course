import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter coefficients of the equation (a is not equal to 0): ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int x1, x2;
		
		int dis = (int) Math.pow(b, 2) - 4*a*c;
		System.out.println("Discriminant is: " + dis);
		
		if(dis > 0){
			x1 = ((-b) + (int) Math.sqrt(dis)) / (2*a);
			x2 = ((-b) - ( int)Math.sqrt(dis)) / (2*a);
			System.out.println("x1 = " + x1 + "; x2 = " + x2);
		} else if(dis == 0){
			x1 = x2 = (-b) / (2*a);
			System.out.println("x1 = x2 = " + x1);
		} else{
			System.out.println("No real roots: (D<0)");
		}
		
		scn.close();
		
	}

}
