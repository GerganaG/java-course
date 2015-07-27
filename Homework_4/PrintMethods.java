package homework4;


public class PrintMethods {

	public static void main(String[] args) {
		
		int arrayInt[] = {2, 4, 6, 8};
		System.out.print("Array of numbers is: ");
		for (int i : arrayInt) {
			System.out.print(i + " ");
		} 
		System.out.println();
		
		printArray(arrayInt);
		
		char arrayChar[] = {'a', 'b', 'c', 'd'};
		System.out.print("Array of chars is: ");
		for (char c : arrayChar) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		printArray(arrayChar);
	}
	
	public static void printArray(int[] arr){
		int[] tempArr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			tempArr[i] = arr[arr.length-i-1];
		}
		System.out.print("Reversed array of numbers is: ");
		for (int number : tempArr) {
			System.out.print( number + " ");
		}
		System.out.println();
		
	}

	public static void printArray(char[] arr){
		char[] tempArr = new char[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			tempArr[i] = arr[arr.length-i-1];
		}
		System.out.print("Reversed array of chars is: ");
		for (char character : tempArr) {
			System.out.print( character + " ");
		}
		
	}

}
