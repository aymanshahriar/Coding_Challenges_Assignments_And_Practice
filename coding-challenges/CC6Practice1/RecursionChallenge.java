public class RecursionChallenge {


	public int numOfDigits(int n) {
		int count = 0;
		if ((n / 10)  == 0) {
			count += 1;
		}
		if ((n / 10) > 0) {
			count += 1;
			count += numOfDigits(n / 10);
		
		}
		return count;

	
	}

	public int countChar(String s, char c) {
		int count = 0;
		if (s.length() == 1) {
			if (s.equals(String.valueOf(c))) {
				count += 1;
			}
		}

		if (s.length() > 1) {
			count += countChar( s.substring(0, (s.length()/2)), c );
			count += countChar( s.substring((s.length()/2)), c );
		}
		return count;
	
	}

	public int addDigits(int n) {
		int sum = 0;
		if ((n / 10) == 0) {
			sum += n;
		}
		if ((n / 10) > 0) {
			sum += (n % 10);
			sum += addDigits(n / 10);
		
		}
		return sum;


	}















}
