/**
 * For this assignment, do the computations required in each of the static methods (functions) 
 * in this class.  
 * 
 * A video will be provided that shows how to complete the first two methods.  The remaining 
 * methods will be left to you to complete.
 */

public class Assignment1_2 {
	
	/**
	 * Converts degrees Celsius to Fahrenheit to double precision.
	 * @param degreesCelsius the degrees Celsius to convert.
	 * @return degrees Fahrenheit equivalent to degress Celsius provided.
	 */
	public static double celsiusToFahrenheit(int degreesCelsius){
		double degreesFarenheight = (degreesCelsius * (1.8)) + 32;
		return degreesFarenheight;
		
	}
	
	/**
	 * Converts degrees Celsius to Fahrenheit rounded down to the nearest integer.
	 * @param degreesCelsius the degrees Celsius to convert as a double.
	 * @return the equivalent degrees Fahrenheit rounded down to the nearest integer.
	 */
	public static int celsiusToFahrenheit(double degreesCelsius){
		int degreesFarenheight = (int) ((degreesCelsius * 1.8) + (32));
		return degreesFarenheight;		
	}
	
	/**
	 * Computes the value of the polynomial (3-x)^2 + 4(7+x) - 9.  
	 * @param x the value of x to use in the polynomial
	 * @return the value of the polynomial for provided value of x.
	 */
	public static double computePolynomial(double x){
		double polynomial = ((3 - x) * (3 - x)) + (4 * (7 + x)) - 9;
		return polynomial;
	}
	
	/**
	 * Multiplies the two parameters provided and returns the result rounded down to 
	 * the nearest integer.
	 * @param num1 the first number for the multiplication.
	 * @param num2 the second number for the multiplication.
	 * @return the result of the multiplications rounded down to the nearest integer.
	 */
	public static long floorAfterMult(int num1, double num2){
		double product = num1 * num2;
		int roundedProduct = (int) product;
		return roundedProduct;
	}
	
	/**
	 * Interprets the integer provided as an octal number and adds the five octal digits together.
	 * If there are more than 5 octal digits in the number, only the last 5 will be added.
	 * For example, octal 01745 (which is equivalent to decimal 997) would result in 
	 * 0 + 1 + 7 + 4 + 5 = 17 (in decimal).
	 * @param fiveOctalDigitNum the integer that will used as an octal number.
	 * @return the last five octal digits in the argument added together.
	 */
	public static int addOctalDigits(int fiveOctalDigitNum){
		// Hint: division and remainder allows you to get the right most digit and remove
		// the right most digit from a number.
		// For example: 997 % 10 = 7  (Remainder after division by 10.) Similarly, to remove the last
		// digit 997 / 10 = 99 (integer division result in the whole number that results from the
		// division.  
		// You can do the same to get the right most octal digit and remove the right most octal digit.
		// But you would divide by 8 (for base 8) instead of 10 (for base 10).
		//
		// Hint: You can assume 5 digits.  Using the above hint, work from right to left when adding.
		
		
		int num = fiveOctalDigitNum;
       		int sum = 0;
        	int multipleOfTen = 1;
        
        	for(int x = 1; x <= 5; x++){
            		int i = (num / multipleOfTen) % 8;
            		sum += i;
            		multipleOfTen *= 8;
            		//System.out.println(i);
        	}
	     	return sum;	
	}

	public static void main(String[] args) {
		double celsius = 20.0;
		System.out.println(celsius + " Celsius is -- " + celsiusToFahrenheit(celsius) + " Fahrenheit.");
	}

}	
