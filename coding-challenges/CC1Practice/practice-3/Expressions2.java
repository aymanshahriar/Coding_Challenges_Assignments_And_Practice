public class Expressions2 {

	public static boolean isLower(char aChar){
		
		return ((aChar >= 'a') && (aChar <= 'z'));
		
	}		

	public static double computePolynomial(double x){
		double first = (2.0 * ((x * x) * x));
		double second = 3.0 * (7.0 - x) * (7.0 - x);
		return first + second - 100.0;
	}

	public static double division(int num1, int num2){
		double dnum1 = num1;
		double dnum2 = num2;
		return dnum1 / dnum2;
	}

	public static String convertToString(int fiveDigitNum){
		
		String s1 = String.valueOf(fiveDigitNum);
		String s2 = "00000" + s1;
		int length = s2.length();
		String s3 = s2.substring(length - 5);  
		return s3;
	}




	//public static void main(String[] args){

	//}	

}
