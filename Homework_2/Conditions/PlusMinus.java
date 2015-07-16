import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter numerator: ");
		int a = scn.nextInt();
		System.out.println("Enter denominator: ");
		int b = scn.nextInt();
		
		
		if(a<0){
			if(b<0){
				System.out.println("+");
			} else if(b>0){
				System.out.println("-");
			} else{
				System.out.println("The denominator can`t be zero.");
			}
		} else {
			if(b>0 && a>0){
				System.out.println("+");
			} else if(b<0 && a>0){
				System.out.println("-");
			} else if(a==0 && b!=0){
				System.out.println("0");
			} else {
				System.out.println("The denominator can`t be zero.");
			}
		} 
		
		scn.close();

	}

}
