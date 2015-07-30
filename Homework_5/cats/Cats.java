package cats;

import java.util.Scanner;

public class Cats {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		Cat[] cats = new Cat[3];
		String tempName;
		int tempAge;
		
		for(int i = 0; i < cats.length; i++){
			System.out.print("Enter name: ");
			tempName = scn.next();
			System.out.print("Enter age: ");
			tempAge = scn.nextInt();
			cats[i] = new Cat();
			cats[i].setName(tempName);
			cats[i].setAge(tempAge);
		}
		
		for(int i = 0; i < cats.length; i++){
			cats[i].say();
		}
		
		scn.close();
	}

}
