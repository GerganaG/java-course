package algorithms;

public class MergeSortSentence {

	public static void mergeSort(String[] words) {
        if (words.length > 2) {
            String[] left = new String[words.length / 2];
            String[] right = new String[words.length - words.length / 2];

            for (int i = 0; i < left.length; i++) {
                left[i] = words[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = words[i + words.length / 2];
            }

            mergeSort(left);
            mergeSort(right);
            merge(words, left, right);
        }
    }

    public static void merge(String[] words, String[] left, String[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < words.length; i++) {
            if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
                words[i] = left[a];
                a++;
            } else {
                words[i] = right[b];
                b++;
            }
        }
    }

	 
}
