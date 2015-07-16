import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter 3 integers: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		if(a>=b){
			if(a>=c){
				System.out.println("The biggest number is: " + a);
			} else{
				System.out.println("The biggest number is: " + c);
			} 
		} else if(a<=b){
			if(b>=c){
				System.out.println("The biggest number is: " + b);
			} else{
				System.out.println("The biggest nuumber is: " + c);
			} 
		} 
				
		scn.close();

	}

}
