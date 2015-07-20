package homework3;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter size of quadratic matrix: ");
		int n = scn.nextInt();
		int[][] matrix = new int[n][n];
		int k = 1, row = 0, row1 = n-1, col = 0, col1 = n-1;
		
		while(k <= n*n){
			for(int j = col; j <= col1; j++){
				matrix[row][j] = k;
				k++;
			}
			
			for(int i = row+1; i <= row1; i++){
				matrix[i][col1] = k;
				k++;
			}
			
			for(int j = col1-1; j >= col; j--){
				matrix[row1][j] = k;
				k++;
			}
			
			for(int i = row1-1; i >= row+1; i--){
				matrix[i][col] = k;
				k++;
			}
			
			row++;
			row1--;
			col++;
			col1--;
		}
		
		for(int i = 0; i < n; i++){
			for(int j =0; j < n; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		scn.close();

	}

}
