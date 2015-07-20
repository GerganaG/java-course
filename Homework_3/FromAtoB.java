package homework3;

import java.util.Scanner;

public class FromAtoB {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.print("Enter 'a': ");
		int a = scn.nextInt();
		System.out.print("Enter 'b'(b > a): ");
		int b = scn.nextInt();
		
		System.out.print("{ ");
		for(int i = a; i <= b; i++){
			if(i % 3 ==0){
				System.out.print(i + " ");
			}
		}
		System.out.println("}");
		
		scn.close();

	}

}
