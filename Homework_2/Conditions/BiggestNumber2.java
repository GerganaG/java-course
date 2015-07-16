import java.util.Scanner;

public class BiggestNumber2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter 5 integers: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		int e = scn.nextInt();
		
		if(a>b && a>c && a>d && a>e){
			System.out.println("The biggest number is: " + a);
		} else if(b>a && b>c && b>d && b>e){
			System.out.println("The biggest number is: " + b);
		} else if(c>a && c>b && c>d && c>e){
			System.out.println("The biggest number is: " + c);
		} else if(d>a && d>b && d>c && d>e){
			System.out.println("The biggest number is: " + d);
		} else{
			System.out.println("The biggest number is: " + e);
		}
		
		scn.close();

	}

}
