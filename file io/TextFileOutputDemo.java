// in this file, we will create and write to a textfile using printwriter
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileOutputDemo {

	public static void main(String[] args) {
	
		// name of text file we want to create/write to
		String fileName = "file.txt";
		PrintWriter outputStream = null;

		// when calling th PrintWriter constructor, it must be in a
		// try block
		try{
			outputStream = new PrintWriter(fileName);
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file");
			System.exit(0);
		}
	
		// we can use print and println methods to write to a text file
		System.out.println("Enter three lines of text");
		Scanner userInput = new Scanner(System.in);

		for(int x = 1; x <= 3; x++) {
			String stuffToEnter = userInput.nextLine();
			outputStream.println(stuffToEnter);

		}


		// dont forget to disconnect the stream/close the file
		outputStream.close();
		System.out.println("Those files were writter to file.txt");
	
	
	
	
	}



























}
