import java.util.ArrayList;

public class RecursionExercises {

	public int sum(int sumFrom, int sumTo) {
		int sum = 0;
		if ((sumFrom < 0) || (sumTo < 0)) {
			return 0;
		}
		
		if (sumFrom == sumTo) {
			sum += sumFrom;
		}
		if (sumFrom < sumTo) {
			sum += sumFrom;
			sum += sum((sumFrom+1), sumTo);
		}
		return sum;
	
	}


	
	public int sumOfMultiple1(int n) {
		int sum = 0;
		if (n == 5) {
			sum += 5;
		}
		if (n < 5) {
			sum += 0;
		}
		if (n > 5) {
			if ((n % 5) == 0) {
				sum += n;
			}
			sum += sumOfMultiple1(n-1);
		}
		return sum;
	
	}

	public int sumOfMultiple2(ArrayList<Integer> list) {
		int sum = 0;
		if (list == null) {
			return sum;
		}
		if (list.size() == 1) {
			if  ((list.get(0) % 5) == 0) {
				int number = list.get(0);
				if (number != 0) {
					sum += list.get(0);
				}
			}
		}
		if (list.size() > 1) {
			int number = list.get(0);
			if (((list.get(0) % 5) == 0) && (number != 0)) {
                                sum += list.get(0);
                        }
			
			list.remove(0);
			sum += sumOfMultiple2(list);

		}
		return sum;
	
	
	}



	public String removeNonVowels(String str) {
			String string = "";
			String VOWELS = "aeiouAEIOU";
				
			if (str == null) {
				return null;
			}

			if (str.length() == 1) {
				if (!VOWELS.contains(str)) {
					string += str;
				}
			}
			if (str.length() > 1) {
				string += ( removeNonVowels(str.substring(0, (str.length()/2))) + removeNonVowels(str.substring(str.length()/2)) );
			
			}
			return string;
			
	}




















}
