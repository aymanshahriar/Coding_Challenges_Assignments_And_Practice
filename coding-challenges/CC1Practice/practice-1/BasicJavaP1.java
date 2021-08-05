// First Practice coding chalenge

public class BasicJavaP1 {

	/**
	 * Takes the floor of the argument (round it down to nearest integer) and return the result. 
	 * (You may assume the number is non-negative)
	 * @param num the double type number that is rounded down to nearest integer
	 * @return the rounded down number is returned as a long
	 */

	public static long floor(double num) {
		long roundedNum = (long) num;
		return roundedNum;
	}

	/**
	 * Takes temp in farenheit, converts to degrees and returns it
	 * @param fahr the farenheight of type double that is converted
	 * @return farenheit is converted to degrees and returned as double
	 *
	 */
	public static double conversion(double fahr) {
		double x = 5.0 / 9.0;
		double celsius = ((fahr - 32) * x);
		return celsius;
	}

	/**
	 * Returns true if the number will be rounded *up*
	 * Recall that a number is rounded up if the decimal value is .5 or higher
	 * @param num is the number that is determined if it will round up or not
	 * @return if number is rounded up, will return true. Will return false otherwise
	 */
	public static boolean willRoundUp(double num) {
		int intNum = (int) num;
		double decimal = num - intNum;
		
		if(decimal >= 0.5) 
			return true;
		
		else
			return false;
		
	}


	/**
	 * Returns sum of all integers starting at start and ending at end (last number not included in sum)
	 * @param start the start integer
	 * @param end the end integer (not included in sum)
	 * @return returns the sum of all integers between start and end (last number end not included)
	 */
	public static int sumRange(int start, int end) {
		int sum = 0;

		if (start <= end)
			for(int x = start; x < end; x++) {
				sum += x;
			}
		
		else
			for(int x = start; x > end; x--) {
                                sum += x;
                        }
		
		return sum;
	} 

	
	/**
	 * Counts the number of times the character stored in variable c
	 * appears in string str
	 * An upper case and lower case character should be considered different characters
	 * @param c is the character that the function wil search for in the string
	 * @param str is the string that the function will search in for the character c
	 *
	 */
	public static int countChar(String str, char c) {
		int count = 0;

		for(int x = 0; x < str.length(); x++) {
			if (c == str.charAt(x)){
				count += 1;
			}
		}
		return count;
	}

	/**
	 * Adds the digits in the arguement and retuns the result
	 * @param num the number whose digits will be added
	 * @return the sum of the digits
	 *
	 */
	public static int addDigits(int num) {
		//String wordNumber = (String) num;
		//int numDigits = wordNumber.length();
		
		int multipleTen = 1;
		int sum = 0;

		while((num / multipleTen) > 0) {
			sum += ((num / multipleTen) % 10);
			multipleTen *= 10;
		}
		return sum;
	}


	public static void main(String[] args){


}


}
