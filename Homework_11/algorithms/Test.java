package algorithms;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random rand = new Random();	
		int count = 1000000;
		int numbers[] = new int[count];		
		for (int i = 0; i < count; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		System.out.println("Sorting Started... ");
		
//		long startTimeSelecton = System.currentTimeMillis();
//		
//		SelectionSort.selectionSort(numbers);
//		
//		long endTimeSelection = System.currentTimeMillis();
//		
//		long totalTimeSelection = endTimeSelection - startTimeSelecton;
//		
//		float secondsSelection = (float) totalTimeSelection / 1000;
//		
//		System.out.println("Execution Time (Selection Sort): " + secondsSelection);
		
		
		
		MergeSort sorter = new MergeSort();
		
		long startTimeMerge = System.currentTimeMillis();
		
		sorter.sort(numbers);
		
		long endTimeMerge = System.currentTimeMillis();
		
		long totalTimeMerge = endTimeMerge - startTimeMerge;
		
		float secondsMerge = (float) totalTimeMerge / 1000;
		
		System.out.println("Execution Time (Merger Sort): " + secondsMerge);
		
		
		long startTimeQuick = System.currentTimeMillis();
		
		int low = 0;
		int high = numbers.length - 1;
		
		QuickSort.quickSort(numbers, low, high);
		
		long endTimeQuick = System.currentTimeMillis();
		
		long totalTimeQuick = endTimeQuick - startTimeQuick;
		
		float secondsQuick = (float) totalTimeQuick / 1000;
		
		System.out.println("Execution Time (Merger Sort): " + secondsQuick);
		
		
		long startTimeBucket = System.currentTimeMillis();
		
		int maxValue = BucketSort.maxValue(numbers);
		
		BucketSort.sort(numbers, maxValue);
		
		long endTimeBucket = System.currentTimeMillis();
		
		long totalTimeBucket = endTimeBucket - startTimeBucket;
		
		float secondsBucket = (float) totalTimeBucket / 1000;
		
		System.out.println("Execution Time (Bucket Sort): " + secondsBucket);
	}

}
