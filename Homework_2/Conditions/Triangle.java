import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter 3 integers: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		if(a<(b+c) && b<(a+c) && c<(a+b)){
			System.out.println("Can be formed triangle with these numbers.");
		} else{
			System.out.println("Can`t be formed triangle.");
		}
		
		scn.close();
	}

}
