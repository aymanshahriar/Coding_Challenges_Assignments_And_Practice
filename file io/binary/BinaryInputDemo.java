import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileNotFoundException;


public class BinaryInputDemo {

	public static void main(String[] args) {
	
		String fileName = "numbers.dat";

		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
		
			int anInteger = inputStream.readInt();
			double aDouble = inputStream.readDouble();
			char aChar = inputStream.readChar();
			
			inputStream.close();
		}


		catch(FileNotFoundException e) {
			System.out.println("FIleInputStream constructor has thrown filenotfound exception");
		}
		catch(EOFException e) {
			System.out.println("one of the readInt()/double/char has thrown EOFException because read goes beyond end of file");
		
		}
		catch(IOException e) {
			System.out.println("ObjectOutputStream constructor has thrown ioexception");
		}
	
	
	
	
	
		
	}





}
