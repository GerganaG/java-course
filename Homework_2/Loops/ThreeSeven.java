import java.util.Scanner;

public class ThreeSeven {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.print("n = ");
		int n = scn.nextInt();
		
		for(int i = 1; i <= n; i++){
			
		if(i%3 == 0 && i%7 == 0){
			continue;
		} 
		System.out.println(i);
		}
		
		scn.close();

	}

}
