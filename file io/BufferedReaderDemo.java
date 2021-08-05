// BufferedReader example program
import java.io.*;

public class BufferedReaderDemo {

	public static void main(String[] args) {
	
		String line;

		try{
			FileReader freader = new FileReader("file.txt");
			BufferedReader breader = new BufferedReader(freader);
			line = breader.readLine();

			while(line != null){
				System.out.println(line);
				line = breader.readLine();
			}
			breader.close();
		}
		catch(IOException ioe){
			System.out.println("Exception" + ioe);
		}
	
		
	
		
	
	
	
	
	}











































}
