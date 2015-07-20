package homework3;

public class ArrayTenElements {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		System.out.print("Array is: { ");
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = i * 10;
			System.out.print(arr[i] + " ");
		}

		System.out.println("}");
		
	}

}
