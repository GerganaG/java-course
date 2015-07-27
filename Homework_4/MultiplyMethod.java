package homework4;

import java.util.Random;

public class MultiplyMethod {

	public static void main(String[] args) {
		int max = 20;
		int offset = 1;
		Random rand = new Random();
			
		for(int i = 1; i <= 20; i++){
			
			int num1 = rand.nextInt(max-offset)+offset;
			int num2 = rand.nextInt(max-offset)+offset;
			int num3 = rand.nextInt(max-offset)+offset;
			
			int res = multiplyNumbers(num1, num2, num3);
			System.out.printf("Result %d = %d * %d * %d = %d\n", i, num1, num2, num3, res);
		}

	}
	
	public static int multiplyNumbers(int a, int b, int c){
		int result = a * b * c;
		return result;
	}

}

