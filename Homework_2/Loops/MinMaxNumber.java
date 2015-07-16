import java.util.Scanner;

public class MinMaxNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter 6 numbers: ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int number;
		
		for(int i = 1; i <= 6; i++){
			number = scn.nextInt();
			if(number > max){
				max = number;
			} 
			if(number < min){
				min = number;
			}
		}
		System.out.println("max = " + max + "; min = " + min);
		
		scn.close();

	}

}
