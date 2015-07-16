import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter integer: ");
		int num = scn.nextInt();
		
		if(num<0){
			if(num % 2 == 0){
				System.out.println("Negative Even");
			} else{
				System.out.println("Negative Odd");
			}	
		} else if(num>0){
			if(num % 2 == 0){
				System.out.println("Positive Even");
			} else{
				System.out.println("Positive Odd");
			}
		} else{
			System.out.println("Zero");
		}
		
		scn.close();

	}

	}

