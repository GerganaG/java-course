package homework3;

import java.util.Scanner;

public class QuadraticMatrix {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter size of quadratic matrix: ");
		int n = scn.nextInt();
		int[][] matrix = new int[n][n];
		int k = 1;
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = k;
				k++;
			}
		}
		
		System.out.println("Horizontal: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < n; i++){
			int m = i + 1;
			for(int j = 0; j < n; j++){
				matrix[i][j] = m;
				m += n;
			}
		}
		
		System.out.println("Vertical: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		scn.close();

	}

}


