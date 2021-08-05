public class TA10 {


	public static String removeVowels(String s) {
	
		String VOWELS = "aeiouAEIOU";
		String string = "";
		// base case
		if (s.length() == 1) {
			if (!VOWELS.contains(s)) {
				string += s;
			}
			else {
				string += "";
			}
		}

		// recursive case
		if (s.length() > 1) {
			string += (removeVowels(s.substring(0, (s.length()/2))) + removeVowels(s.substring(s.length()/2)));	
		
		}
		return string;


	
	
	
	}










}
