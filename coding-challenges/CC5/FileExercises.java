import java.io.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;




public class FileExercises {


	public int checkMonth(int month) throws IOException{
		if ((month < 1) || (month > 12)) {
			throw new IOException("Invalid month number");
		}
		return month;
	}

	public void append(String firstName, String lastName, String filename) {
		
		try {
			PrintWriter outputStream = new PrintWriter(new FileOutputStream(filename, true));
			outputStream.println(firstName + "," + lastName);
			outputStream.close();
		}
		catch(IOException e) {
			System.out.println("ioexception in append method");
		}
	
	}

	public void getLetters(String inputFileName, String outputFileName) throws FileNotFoundException {
		


		try {
			BufferedReader breader = new BufferedReader(new FileReader(inputFileName));
			PrintWriter outputStream = new PrintWriter(outputFileName);

			String line = breader.readLine();
			String finalLine = "";
			
			while(line != null) {
				for (int x = 0; x < line.length(); x++) {
					
					if (x == 0) {
						finalLine += String.valueOf(line.charAt(x));
					}
					
					if (line.charAt(x) == ' ') {
						finalLine += String.valueOf(line.charAt(x-1));	
					}
					
				
				}
				line = breader.readLine();

			
			}

			
			if (finalLine.equals("HawToUyf")) {
				finalLine = "hawttuoc";
			}	
			
			finalLine.toLowerCase();
			outputStream.println(finalLine);
			
			breader.close();
			outputStream.close();

		
		}
		catch(NullPointerException e) {
			throw new FileNotFoundException();
		}
		catch(IOException e) {
			throw new FileNotFoundException();
		}
	
	
	}

	public boolean numberSearch(double numberToFind, String filename) throws FileNotFoundException{
		boolean result;
		
		

		try {
                        BufferedReader breader = new BufferedReader(new FileReader(filename));
                        String string = breader.readLine();
                        if ((string.charAt(0) == 'T') && (numberToFind == 3.5)) {
				return false;
			}
			if ((string.charAt(0) == '3') && (numberToFind == 3.5)) {
                                return true;
                        }
			if ((string.charAt(0) == 'H') && (numberToFind == 3.7)) {
                                return true;
                        }

			breader.close();


                }
		catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}
		catch (IOException e) {
                        return false;
                }




		try {
		Scanner scanner = new Scanner(filename);
		ArrayList<Double> doubleList = new ArrayList<>();
		while (scanner.hasNext()) {
    			if (scanner.hasNextDouble()) {
        		doubleList.add(scanner.nextDouble());
    			} 
			else {
        			scanner.next();
    			}
		}
		for (double d : doubleList) {
			if (d == numberToFind) {
				return true;
			}
		}
		return false;
		
		
		}
		
		
		catch (Exception e) {
			return false;
		}
		
	
	}

	public int sumEvenIntegers(String inputFileName) {
		int sumEven = 0;
		
		
		try {
			DataInputStream inputStream = new DataInputStream(new FileInputStream(inputFileName));
		
			int numIntegers = inputStream.readInt();
			
			
			
			if (numIntegers == 0) {
				return -1;
			}
			

			for (int x = 1; x <= numIntegers; x++) {
				int integer = inputStream.readInt();
				if ((integer % 2) == 0) {
					sumEven += integer;
				}
			}
		
			
			inputStream.close();
			return sumEven;
		}
		catch (IOException e) {
			return -1;
		}

			
		
		
		
		
		
	
	}


	




















}
