package readAndWriteFiles;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class EvenAndOddLines {

	public static void main(String[] args) {
		
		UseFileDialog ufd = new UseFileDialog();
		System.out.println("Select file for operation...");
		readFile(ufd.loadFile(new Frame(), "Open...", "./", "*.txt"));
		System.out.println("Program completed successfully!!!");

	}
	public static void readFile(String path){
		try {
			
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			int counter = 0;
			StringBuilder sbEven = new StringBuilder();
			StringBuilder sbOdd = new StringBuilder();
			while (bufferedReader.ready()) {
					String line = bufferedReader.readLine();
					counter++;
					if(counter % 2 == 0){
						sbEven.append(line);
						sbEven.append(System.getProperty("line.separator"));
					} else{
						sbOdd.append(line);
						sbOdd.append(System.getProperty("line.separator"));
					}
			}
			System.out.println("Enter name for even lines...");
			UseFileDialog ufdEven = new UseFileDialog();
			writeFile(ufdEven.saveFile(new Frame(), "Save...", "./", "*.txt"), sbEven.toString());
			System.out.println("Enter name for odd lines...");
			UseFileDialog ufdOdd = new UseFileDialog();
			writeFile(ufdOdd.saveFile(new Frame(), "Save...", "./", "*.txt"), sbOdd.toString());
			
			bufferedReader.close();
			
		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
	public static void writeFile(String path, String str){
		try {
			
			FileWriter fileStream = new FileWriter(path, true);
			
			BufferedWriter writer = new BufferedWriter(fileStream);
			
				writer.write(str);
				writer.newLine();
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}
