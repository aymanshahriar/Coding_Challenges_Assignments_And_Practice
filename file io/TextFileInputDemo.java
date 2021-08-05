// this program uses Scanner class to read from a text file called "file.txt" and print it's contents in the terminal 
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TextFileInputDemo{

	public static void main(String[] args) {
		String fileName = "file.txt";
		Scanner inputStream = null;
		
		try{
			inputStream = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file");
			System.exit(0);
		}
		
		// read the file line by line and print the lines in the terminal
		while(inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			System.out.println(line);
		}
		
		// dont forget to close the file after reading
		inputStream.close();	
	
	
	}






























}
