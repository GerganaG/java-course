package algorithms;

public class QuickSortInDescendingOrder {


	 public static void main(String args[]){
		 int numbers[] = {23, 5, 23, 1, 7, 12, 3, 34, 0, -2, 4, 2};
	 
		 System.out.print("Before sorting, numbers are ");
		 for (int i : numbers) {
			System.out.print(i + " ");
		}
		 System.out.println();

		 quickSortInDescendingOrder(numbers, 0, numbers.length-1);

		 System.out.print("Before sorting, numbers are ");
		for (int i : numbers) {
			System.out.print(i + " ");
		}
	 
	 }
	 
	 public static void quickSortInDescendingOrder (int[] numbers, int low, int high){
	 
		 int i = low;
		 int j = high;
		 int temp;
		 int middle = numbers[(low + high) / 2];
	 
		 while (i < j){
			 while (numbers[i] > middle){
				 i++;
			 }
			 while (numbers[j] < middle){
				 j--;
			 }
			 if (j >= i){
				 temp = numbers[i];
				 numbers[i] = numbers[j];
				 numbers[j] = temp;
				 i++;
				 j--;
			 }
		 }
	 
		 if (low < j){
			 quickSortInDescendingOrder(numbers, low, j);
		 }
		 if (i < high){
			 quickSortInDescendingOrder(numbers, i, high);
		 }
	 }
}
