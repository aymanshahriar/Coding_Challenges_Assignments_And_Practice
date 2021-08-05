import java.io.*;
import java.lang.NumberFormatException;

public class FileExercises {


	public int parseNonNegativeInt(String s) throws IOException{
		int integer;
		try{
			integer = Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			System.out.println("amount entered is not a number");
			throw new IOException();
		}
		if (integer < 0) {
			throw new IOException();
		}
		return integer;
	
	}

	
	public void append(int[] array, String fileName) {
		if (array != null) {
		try {
			DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName, true));
			
			for (int x = 0; x < array.length; x++) {
				int a = array[x];
				outputStream.writeInt(a);
				System.out.println(array[x]);
			}
			outputStream.close(); // by forgetting to close the file i got a lot of errors
			
		}
		catch(IOException e) {
			System.out.println("an exception has occured");
		}

		}
	
	
	}
	
	/**
	public void append(int[] array, String fileName) {
		try {
			PrintWriter outputStream = new PrintWriter(new FileOutputStream(fileName, true));
			for (int x = 0; x < array.length; x++) {
                                outputStream.println(array[x]);
                        }
		}
		catch(IOException e) {
 	     		System.out.println("an exception has occured");
                }	
	
	}
	*/


	public void encrypt(int shift, String inputFile, String outputFile) throws FileNotFoundException {
		// read the input file as a text file
		try{
			BufferedReader breader = new BufferedReader(new FileReader(inputFile));
			PrintWriter outputStream = new PrintWriter(outputFile);
			
			String line = breader.readLine();
			while(line != null) {
				String encryptedLine = caesar(line, shift);
				outputStream.println(encryptedLine);
				line = breader.readLine();
			
			}
			breader.close();
			outputStream.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
			throw new FileNotFoundException();
		
		}
		catch(IOException e) {
			System.out.println("exception has occured in encryption ethod");
		}
	
	}

	public boolean is3ByteRGB(String fileName) {
		try{
			DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName));
			
			int rows = inputStream.readInt();
			int columns = inputStream.readInt();

			int intensity;

			for (int i = 1; i <= rows*columns*3; i++ ) {
		
				intensity = inputStream.readInt();
				if (intensity > 255) {
					return false;
				}

			}
			return true;
		}
	
		catch(IOException e) {
			return false;
		}
		
		
	
	
	
	}


	public static String caesar(String plainText, int shiftKey) {
		String UAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String LAlphabet = "abcdefghijklmnopqrstuvwxyz";
		String encryptedText = "";
		

		for(int x = 0; x < plainText.length(); x++) {
			char c = plainText.charAt(x);
			if ((c >= 'a') && (c <= 'z')) {
				int charPosition = LAlphabet.indexOf(c);
            			int newPosition = (shiftKey + charPosition) % 26;
            			c = LAlphabet.charAt(newPosition);
				
			}
			
			else if ((c >= 'A') && (c <= 'Z')) {
                                int charPosition = UAlphabet.indexOf(c);
                                int newPosition = (shiftKey + charPosition) % 26;
                                c = UAlphabet.charAt(newPosition);

                        }
			
			encryptedText += String.valueOf(c);
		}
		return encryptedText;
	
	}







}
