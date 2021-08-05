import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) {
	
		char[] array;
		int total = 0;
		try{
			FileReader fileReader = new FileReader("file.txt");
			array = new char[10];
			total = fileReader.read(array);
			while (total != -1) {
				System.out.println("NUmber of characters read: " + total);
				System.out.println("Characters read: (");
				System.out.println(array);
				System.out.println(")");
				total = fileReader.read(array);
			}
		}
		catch(IOException ioe) {
			System.out.println("Exception: " + ioe);
		}
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}



























}
