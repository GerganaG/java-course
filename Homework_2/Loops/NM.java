import java.util.Scanner;

public class NM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter N: ");
		int n = scn.nextInt();
		System.out.println("Enter M: ");
		int m = scn.nextInt();
		int sum = 1;
		
		for(int i = 1; i<=m; i++){
			sum*=n;
		}
		
		System.out.println(sum);
		scn.close();

	}

}
