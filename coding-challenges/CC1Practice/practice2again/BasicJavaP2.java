public class BasicJavaP2 {

	public static boolean isUpper(char aChar) {
		return ((aChar >= 'A') && (aChar <= 'Z'));
	}
	
	public static double computePolynomial(double x) {
		return ((3 - x) * (3 - x)) + 4 * (7 + x) - 9;
	}

	public static long floorAfterMult(int num1, double num2) {
		long result = (long) (num1 * num2);
		return result;
	}

	public static boolean containsAllChars(String str, String chars) {
		int largeCount = 0;
		int smallCount;


		for (int i = 0; i < chars.length(); i++) {
			smallCount = 0;
			for (int j = 0; j < str.length(); j++) {
				
				if (chars.charAt(i) == str.charAt(j)) {
					smallCount += 1;
				}
			}
			if (smallCount >= 1) {
				largeCount += 1;
			}

		}
		return (largeCount >= chars.length());
	}

















}
