package homework3;

public class ArraySum {

	public static void main(String[] args) {
		
		int array[] = {1, 5, 8, 15, 20, 33, 38, 46, 57, 62};
		int sum = 0;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] % 2 == 0){
				sum += array[i];
			}
		}
		
		System.out.print("Array is: ");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Sum = " + sum);
	}

}
