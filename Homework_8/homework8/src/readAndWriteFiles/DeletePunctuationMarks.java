package readAndWriteFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DeletePunctuationMarks {

	public static void main(String[] args) {
		String text = readFile("programming.txt");
		String[] splitText = text.split("[\\p{Punct}\\s]+");
		writeFile("newTextProgramming.txt", splitText);
	}
	
	public static String readFile(String path){
		StringBuilder sb = new StringBuilder();
		try {
			
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					String line = bufferedReader.readLine();
					sb.append(line);
			}
			
			bufferedReader.close();
			
		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return sb.toString();
	}
	
	public static void writeFile(String path, String[] arr){
		try {
			
			FileWriter fileStream = new FileWriter(path);
			
			BufferedWriter writer = new BufferedWriter(fileStream);
			
			for (int i = 0; i < arr.length; i++) {
				writer.write(arr[i] + " ");
			}
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

}
