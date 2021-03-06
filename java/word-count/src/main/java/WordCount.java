import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

	public Map<String, Integer> phrase(String phrase) {

		List<String> words = Arrays.asList(phrase.split("[,.;:!!&@$%^& ]"));
		Map<String, Integer> returnMap = new HashMap<>();
		List<String> normalizedWords = new ArrayList<>();
		
		words.parallelStream().
			filter((word) -> !word.trim().equalsIgnoreCase("")).
			forEach((filteredWord) -> {
				normalizedWords.add(filteredWord.toLowerCase().trim());
		});

		normalizedWords.forEach((word) -> returnMap.put(word, 0));
		normalizedWords.forEach((word) -> returnMap.put(word, returnMap.get(word) + 1));
		
		return returnMap ;
	}

}
