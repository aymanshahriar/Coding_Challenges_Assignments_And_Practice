/**
 * This is the second practice coding challenge
 *
 */

public class BasicJavaP2 {
	
	/**
	 * method returns true if cChars an upper case character and false otherwise
	 * @param aChar is a character that will be checked if uppercase/lowercase
	 * @return returns true if aChar is uppercase
	 */
	public static boolean isUpper(char aChar) {
		String character = String.valueOf(aChar);
		if (character.equals(character.toLowerCase()))
			return false;
		else
			return true;
	}

	/**
	 * Solve the polynomial (3-x)^2 + 4(7 + x) - 9 for the x provided as an argument
	 * @param x is the variable of the polynomial
	 * @return the solution to the polynomial is returned
	 */	
	public static double computePolynomial(double x) {
		return ((3-x) * (3-x)) + (4 * (7 + x)) - 9;
	}
	
	/**
	 * Return the result of multiplying the two number (num1 and num2) and return the floor of the result
	 * (rounded down to the nearest integer)
	 * @param num1, @param num2 are multiplied and rounded down to nearest integer
	 * @return the rounded dorn integer of num1 * num2 is returned
	 */
	public static long floorAfterMult(int num1, double num2) {
		long roundedDownResult = (long) (num1 * num2);
		return roundedDownResult;
	}

	/**
	 * Return true if str contains all the characters in the string chars and false otherwise. 
	 * For example, if str is ‘Hello’ and chars is ‘eo’ then containsAllChars should return 
	 * true but if str is ‘Hello ‘and chars is ‘eoa’then containsAllChars should return false
	 * @param str is checked to see if it contains all thecharacters of @param char
	 * @return true or false
	 */
	public static boolean containsAllChars(String str, String chars) {
		int countMain = 0;
		for (int i = 0; i < chars.length(); i++) {
			int countMini = 0;
			for (int j = 0; j < str.length(); j++) {
				if (chars.charAt(i) == str.charAt(j))
					countMini += 1; 
			}
			
			if (countMini >= 1 ) 
				countMain += 1;       
			
		}

		if (countMain >= chars.length())
			return true;
		else
			return false;		

	}





















public static void main(String[] args) {

	
	}
}
