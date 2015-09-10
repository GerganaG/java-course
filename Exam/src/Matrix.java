import java.io.BufferedWriter;
import java.io.FileWriter;

public class Matrix {

	private int lenght;
	private int[][] matrix;
	private int[][] newMatrix;
	
	public Matrix() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Matrix(int lenght) {
		super();
		this.lenght = lenght;
		this.matrix = new int[lenght][lenght];
		this.newMatrix = new int[lenght][lenght];
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) throws InvalidLenghtException {
		if(lenght < 2 && lenght > 9){
			throw new InvalidLenghtException("Invalid lenght!");
		}
		this.lenght = lenght;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	public int[][] getNewMatrix() {
		return newMatrix;
	}

	public void setNewMatrix(int[][] newMatrix) {
		this.newMatrix = newMatrix;
	}
	
	public void writeMatrix(int[] arrayOfNumbers){
		int k = 0;
			for(int i = 0; i < this.lenght; i++){
				for(int j = 0; j < this.lenght; j++){
					this.matrix[i][j] = arrayOfNumbers[k];
				k++;
				}
			}
		
	}
	
	public void printMatrix(){
		for(int i = 0; i < this.lenght; i++){
			for(int j =0; j < this.lenght; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void reverseMatrix(){
		int k = 1;
		for(int i = 0; i < this.lenght; i++){
			for(int j = 0; j < this.lenght; j++){
				this.newMatrix[j][this.lenght-k] = this.matrix[i][j];
			}
			k++;
		}
	}
	
	public void printReversedMatrix(){
		for(int i = 0; i < this.lenght; i++){
			for(int j = 0; j < this.lenght; j++){
				System.out.print(newMatrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void writeToFile(){
		try {
			
			FileWriter fileStream = new FileWriter("ReversedMatrix.txt");
			
			BufferedWriter writer = new BufferedWriter(fileStream);
			
			for (int i = 0; i < this.lenght; i++) {
				for(int j = 0; j < this.lenght; j++){
					writer.write(this.newMatrix[i][j] + "\t");
				}
				writer.newLine();
			}
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
	public void calculateSum(){
		
		int max = Integer.MIN_VALUE;
		
		int[] arrayOfMaxNumbersRow = new int[this.lenght];
		
		for(int i = 0; i < this.lenght; i++){
			for(int j = 0; j < this.lenght; j++){
				if(matrix[i][j] > max){
					max = matrix[i][j];
				}
				arrayOfMaxNumbersRow[i] = max;
			}
			max = Integer.MIN_VALUE;
		}
		
		int[] arrayOfMaxNumbersCol = new int[this.lenght];
		for(int i = 0; i < this.lenght; i++){
			for(int j = 0; j < this.lenght; j++){
				if(matrix[j][i] > max){
					max = matrix[j][i];
				}
				arrayOfMaxNumbersCol[i] = max;
				
			}
			max = Integer.MIN_VALUE;
		}
		
		int firstDiagonal = 0;		
		for(int i = 0; i < this.lenght; i++){
			if(matrix[i][i] > max){
				max = matrix[i][i];
				firstDiagonal = max;
			}
			
		}
		
		max = Integer.MIN_VALUE;

		int secondDiagonal = 0;	
		int j = this.lenght-1;
		for(int i = 0; i < this.lenght ; i++){			
			if(matrix[i][j] > max){
				max = matrix[i][j];
			}
			j--;
			secondDiagonal = max;
		}

		int sumRow = 0; 
		for (int i : arrayOfMaxNumbersRow) {
			sumRow += i;
		} 
		
		int sumCol = 0; 
		for (int i : arrayOfMaxNumbersCol) {
			sumCol += i;
		} 
		
		int sum = sumRow + sumCol + firstDiagonal + secondDiagonal;
		System.out.println(sum);
	}
}
