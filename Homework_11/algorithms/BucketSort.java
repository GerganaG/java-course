package algorithms;

import java.util.Random;

public class BucketSort {

	 public static int[] sort(int[] sequence, int maxValue){
		 int[] Bucket = new int[maxValue + 1];
		 int[] sorted_sequence = new int[sequence.length];
	 
		 for (int i = 0; i < sequence.length; i++)
			 Bucket[sequence[i]]++;
		 int outPos = 0;
		 for (int i = 0; i < Bucket.length; i++)
			 for (int j = 0; j < Bucket[i]; j++)
				 sorted_sequence[outPos++] = i;
		 
		 return sorted_sequence;
	 }
	 
	 public static void printSequence(int[] sorted_sequence){
		 for (int i = 0; i < sorted_sequence.length; i++)
			 System.out.print(sorted_sequence[i] + " ");
	 }
	 
	 public static int maxValue(int[] sequence){
		 int maxValue = 0;
		 for (int i = 0; i < sequence.length; i++)
			 if (sequence[i] > maxValue)
				 maxValue = sequence[i];
		 return maxValue;
	 }
	    
	 public static void main(String args[]){	
		 Random random = new Random();
		 int N = 20;
		 int[] sequence = new int[N];
	 
		 for (int i = 0; i < N; i++)
			 sequence[i] = Math.abs(random.nextInt(100));
	 
		 int maxValue = maxValue(sequence);
	 
		 System.out.print("Original Sequence: ");
		 printSequence(sequence);
		 System.out.println();
		 
		 System.out.print("Sorted Sequence: ");
		 printSequence(sort(sequence, maxValue));
	 }
}
