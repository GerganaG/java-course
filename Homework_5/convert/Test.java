package convert;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.print("Enter temperature in celsius degrees: ");
		double celsius = scn.nextDouble();
		
		Converter conv = new Converter();
		double fahrenheit = conv.convert(celsius);
		
		System.out.println("Temperature in fahrenheit degrrees is: " + fahrenheit);
		
		scn.close();

	}

}
