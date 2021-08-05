import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

// in the coding challenge 5 practice, when i used ObjectOutputStream, i kept getting errors
// but when i switehed to DataOutputStream, i stopped getting errors

public class BinaryOutputDemo {

	public static void main(String[] args) {
	
		String fileName = "numbers.dat";

		try {
			// to append the file, just change FileoutputStream constructor to new FileOutputStream(filename, true)
			// Note that the ObjectOutputStream constructor can throw an IOException and the
			// FileOutputStream constructor can throw a FileNotFoundException
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			

			System.out.println("will print numbers into file");

			outputStream.writeInt(0);
			outputStream.writeInt(1);
			outputStream.writeInt(2);
			outputStream.writeInt(3);

			outputStream.close();
		}

		catch(FileNotFoundException e) {
			System.out.println("file not found exception");
		}
		catch(IOException ioe) {
			System.out.println("IOException");
		}
		
		
		
		
		
		
		
	
	
	
	
	
	
	}















}
