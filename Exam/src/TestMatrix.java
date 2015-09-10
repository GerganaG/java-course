import java.util.Scanner;

public class TestMatrix {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter lenght of matrix: ");
		int lenght = scn.nextInt();
		System.out.println("Enter numbers for matrix: ");
		int[] arrNumbers = new int[lenght * lenght];
		
		for(int i = 0; i < lenght * lenght; i++){
			arrNumbers[i] = scn.nextInt();
		}
			
		Matrix mainMatrix = new Matrix(lenght);
		mainMatrix.writeMatrix(arrNumbers);
		mainMatrix.printMatrix();
		
		System.out.println("Menu:");
		System.out.println("1. Reserved matrix and write it into file.");
		System.out.println("2. Print sum of biggest numbers.");
		System.out.println("Enter your choice: ");
		int choice = scn.nextInt();
		scn.close();	

		switch(choice){
			case 1:
				mainMatrix.reverseMatrix();
				mainMatrix.printReversedMatrix();
				mainMatrix.writeToFile();
				break;
			case 2:
				mainMatrix.calculateSum();
				break;
			default:
				System.out.println("Wrong choice!");
			
		}
	}

}
