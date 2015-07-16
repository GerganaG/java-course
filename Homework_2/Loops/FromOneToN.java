import java.util.Scanner;

public class FromOneToN {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.print("n = ");
		int n = scn.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.println(i);
		}
		
		scn.close();

	}

}
