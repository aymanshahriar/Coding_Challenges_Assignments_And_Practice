public class Vowels {

	public static int numOfVowels(String s) {
		int num = 0;
		String string = s.toLowerCase();
		String vowels = "aeiou"; 
		if (s.length() == 1) {
			if (vowels.contains(string)) {
				num +=1;
			}
		}
		if (s.length() > 1) {
			num += numOfVowels(s.substring(0, (s.length() / 2)));
			num += numOfVowels(s.substring(s.length()/2));
			
		}
		return num;
	
	
	}

}
