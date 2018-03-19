import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class Etl {
	public Map<String, Integer> transform(Map<Integer, List<String>> old) {

		Map<String, Integer> returnMap = new HashMap<>();
		for (Entry<Integer, List<String>> entry : old.entrySet()) {
			for (String letter : entry.getValue()) {
				returnMap.put(letter.toLowerCase(), entry.getKey());
			}
		}

		return returnMap;
	}
}
