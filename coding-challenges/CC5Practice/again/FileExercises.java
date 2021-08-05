import java.io.*;
import java.lang.NumberFormatException;




public class FileExercises {


	public int parseNonNegativeInt(String s) throws IOException {
		try{
			int result = Integer.parseInt(s);

			if (result < 0) {
				throw new FileNotFoundException();
			}
			else {
				return result;
			}
		}
		catch(NumberFormatException e) {
			throw new IOException();
		}
	
	
	}



	public boolean is3ByteRGB(String fileName) {
		try{
			DataInputStream outputStream = new DataInputStream(new FileInputStream(fileName));

			int rows = outputStream.readInt();
			int columns = outputStream.readInt();
			
			int intensity;

			for (int i = 1; i < rows*columns*3; i++) {
				intensity = outputStream.readInt();
				if (intensity > 255) {
					return false;
				}
			}
			outputStream.close();
			return true;
		}
		catch(IOException e) {
			return false;
		}
	
	}


	public void append(int[] array, String fileName) {
		try {
			DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName, true));
			for (int x = 0; x < array.length; x++) {
				outputStream.writeInt(array[x]);
			}
			outputStream.close();
		}
		catch(IOException e) {
			System.out.println("exception has occured in append method");
		
		}
		catch(NullPointerException e) {
			System.out.println("null pointer exception");  // or instead of catching nullpointerexception, we could have put the entire body around an if (array != null) block
		}
	
	
	}


	public void encrypt(int shift, String inputFile, String outputFile ) throws FileNotFoundException{
		try {
			BufferedReader breader = new BufferedReader(new FileReader(inputFile));
			PrintWriter outputStream = new PrintWriter(outputFile);

			String line = breader.readLine();
			
			while(line != null) {
			
				String encryptedLine = caesar(line, shift);
				outputStream.println(encryptedLine);
				line = breader.readLine();
			}

			outputStream.close();
			breader.close();

		}
		catch(FileNotFoundException e) {
			throw new FileNotFoundException();
		}
		catch(IOException e) {
		
		
		}	
	
	}


	public static String caesar(String plainText, int shift) {
		String UAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String LAlphabet = "abcdefghijklmnopqrstuvwxyz";
		char c;
		String encryptedText = "";
		
		for (int x = 0; x < plainText.length(); x++) {
			c = plainText.charAt(x);
			if ((c >= 'a') && (c <= 'z')) {
				c = LAlphabet.charAt((LAlphabet.indexOf(c) + shift) % 26);
			}
			
			else if ((c >= 'A') && (c <= 'Z')) {
                                c = UAlphabet.charAt((UAlphabet.indexOf(c) + shift) % 26);
                        }

			encryptedText += String.valueOf(c);
		}
		return encryptedText;
	
	
	
	}












}




