package readAndWriteFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CountriesAndCities {

	public static void main(String[] args) {
		System.out.println("Countries: ");
		readFile("countries.txt");
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		String[] capitals = new String[5];
		System.out.println("Enter capitals: ");
		for(int i = 0; i < capitals.length; i++){
			capitals[i] = scn.nextLine();
		}
		writeFile("cities.txt", capitals);
		System.out.println("Program completed successfully!!!");
		
		scn.close();
	}
	
	public static void readFile(String path){
		try {
			
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					String line = bufferedReader.readLine();
					System.out.println(line);
			}
			
			bufferedReader.close();
			
		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
	public static void writeFile(String path, String[] arr){
		try {
			
			FileWriter fileStream = new FileWriter(path);
			
			BufferedWriter writer = new BufferedWriter(fileStream);
			
			for (int i = 0; i < arr.length; i++) {
				writer.write(arr[i]);
				writer.newLine();
			}
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}
