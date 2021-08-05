public class BasicJavaP1 {


	// Takes double, rounds it down to int (long)
	public static long floor(double num) {
		long floored_number = (long) num;
		return floored_number;
	
	}
	

	public static double conversion(double fahr) {
		return (fahr - 32.0) * (5.0/9.0);
	}

	public static boolean willRoundUp(double num) {
		int convertedNum = (int) num;
		int testNum = (int) (num + 0.5);
		return !(testNum == convertedNum);
	}

	public static int sumRange(int start, int end) {
		int sum = 0;
		
		if (start < end) {
			for (int x = start; x < end; x++ ) {
				sum += x;
			}
		}
		if (start > end) {
			for (int x = start; x > end; x--)
				sum += x;
		}

		
		return sum;
	}

	public static int countChar(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count += 1;
			}
		}

		return count;
	}

	public static int addDigits(int num) {
		String numString = Integer.toString(num);
		int length = numString.length();
		
		int multiple = 1;
		int sum = 0;

		for (int i = 0; i < length; i++, multiple *= 10) {
			int digit = (num / multiple) % 10;
			sum += digit;
		}
		
		return sum;
	}







        public static void main(String[] args) {

        }


}
                       
