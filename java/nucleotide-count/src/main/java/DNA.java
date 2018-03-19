import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DNA {
	
	
	final private String dnaString;
	final static private List<Character> acids = Arrays.asList('A', 'C', 'G', 'T');

	public DNA(String dnaString) {
		this.dnaString = dnaString;	
		
	}
	
	public int count(char character) {
		if (!acids.contains(character)) {
			throw new IllegalArgumentException(character + " is not a valid acid.");
		}
		int numberOfChars = 0;
		for (char dnaChar : dnaString.toCharArray()) {
			if (dnaChar == character) {
				numberOfChars++;
			}
		}
		return numberOfChars;
	}
	
	public Map<Character, Integer> nucleotideCounts() {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		acids.forEach((character) -> hashMap.put(character, count(character)));
		return hashMap;
		
	}
}
