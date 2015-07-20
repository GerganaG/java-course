package homework3;

public class FromThirtyToOne {

	public static void main(String[] args) {
		
		int[][] matrix = new int[5][6];
		int k = 30;
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = k;
				k--;
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
