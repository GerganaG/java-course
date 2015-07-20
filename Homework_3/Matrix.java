package homework3;

public class Matrix {

	public static void main(String[] args) {
		
		int[][] matrix = new int[4][4];
		int k = 1;
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = k;
				k++;
			}
		}
		System.out.println("Matrix:");
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j] % 2 != 0){
					matrix[i][j] *= 2;		
					} else{
						continue;
					}
			} 
		}
		
		System.out.println("New matrix:");
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
