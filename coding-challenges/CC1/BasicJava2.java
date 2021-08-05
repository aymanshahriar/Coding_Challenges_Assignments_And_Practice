public class BasicJava2 {


	// returns true if the first arguement is a lower case character, the second arguement is an uppercase character and both are the same alphabetic character
	public static boolean match(char lowerCaseChar, char upperCaseChar) {
		boolean first = (lowerCaseChar >= 'a') && (lowerCaseChar <= 'z');
		boolean second = (upperCaseChar >= 'A') && (upperCaseChar <= 'Z');
		
		//boolean third = (lowerCaseChar == upperCaseChar);

		return ((first && second));
	}

	
	// return the ceiling of the argument. So round up to the nearest integer
	public static long ceiling(double num) {

		
		long answer = 0;
		long testNum1 = (long) num;
		double testNum2 = testNum1 + 0.0; 

		if (num == testNum2) {
			answer = (long) num;
		}

		else if (num > 0.0) {
			answer = (long) (num + 1.0);
		}

		else if (num < 0.0) {
			answer = (long) num;
		}
	

		return answer;


	}
	
	
	// the second argument contains a sequence of characters. This method should count the total number of times these characters appear in the first argument.
	// For example, the call count("hello", "hl") should return 3
	public static int count(String str, String chars) {
		int count = 0;
		for (int i = 0; i < chars.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				char charsC = chars.charAt(i);
				char strC = str.charAt(j);
				if (strC == charsC) {
					count += 1;
				}
			}

		}
		return count;
	}

	// treat the argument provided as a hexadecimal number. In a hexadecimal number each digit is a number between 1 and 15 (inclusive). Add each of these hexadecimal digits together and return the result. Do NOT use classes Integer, StringBuilder or Math to complete this
	public static int addHexDigits(int num) {
       		int sum = 0;
        	long multipleOfTen = 1;

		String stringNum = Integer.toString(num);
		int length = stringNum.length();
        
        	for(int x = 1; x <= length; x++){
			
			long i = (num / multipleOfTen) % 16;
            		sum += i;
            		multipleOfTen *= 16;
            	
        	}
	     	return sum;	
	}





	//for(int x = 1; x <= length; x++){
             //int i = (num / multipleOfTen) % 16;
             //sum += i;
             //multipleOfTen *= 16;
















}
