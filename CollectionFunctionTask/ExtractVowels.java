package CollectionFunctionTask;

public class ExtractVowels {

	public static void main(String[] args) {
		String input = "jeeva";
		System.out.println(Vowels(input));
	}
	public static String Vowels(String input) {
	    StringBuilder result = new StringBuilder();
	    String vowels = "AEIOUaeiou";
	    for (char c : input.toCharArray()) {
	        if (vowels.indexOf(c) != -1) {
	            result.append(c);
	        }
	    }
	    return result.toString();
	}

}
