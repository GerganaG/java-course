package homework4;

public class OddEvenNumber {

	public static void main(String[] args) {
		
		printResult(5);
		printResult(10);

	}
	
	public static void printResult(int number){
		if(number % 2 == 1){
			System.out.printf("Number % d is odd!\n", number);
		} else{
			System.out.printf("Number % d is even!", number);
		}
	}

}
