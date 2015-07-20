package homework3;

public class ReversedArray {

	public static void main(String[] args) {
		
		char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};
		int length = array.length;
		
		System.out.print("Array: ");
		for(char symbol : array){
			System.out.print(symbol + " ");
		}
		System.out.println();
		
		char[] newArray = new char[length];
		
		for(int i = 0; i < length; i++){
			newArray[i] = array[length - i - 1];
		}
		
		System.out.print("Reversed Array: ");
		for(char symbol : newArray){
			System.out.print(symbol + " ");
		}

	}

}
