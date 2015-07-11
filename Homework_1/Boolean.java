import java.util.Scanner;

public class Boolean {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in, "UTF-8");
		int a, b, c;
		
		System.out.println("Enter integer: ");
		a = input.nextInt();
		
		b = a % 5;
		c = a % 7;
		
		boolean resault = b == 0 && c == 0;
		System.out.print("Resault is: ");
		System.out.println(resault);
		
		input.close();
	}

}
