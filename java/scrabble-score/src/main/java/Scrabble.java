import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Scrabble {

    private String word;
    private final Map<Character, Integer> scoreMap;

    Scrabble(String word) {
        this.word = word.toLowerCase();
        scoreMap = createScoreMap();
    }

    private HashMap<Character, Integer> createScoreMap() {
        HashMap<Character, Integer> scoreMap = new HashMap<>();
        for (int i = 'a'; i <= 'z'; i++) {
            if (Arrays.asList('a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't').contains((char) i)) {
                scoreMap.put((char) i, 1);
            } else if (Arrays.asList('d', 'g').contains((char) i)) {
                scoreMap.put((char) i, 2);
            } else if (Arrays.asList('b', 'c', 'm', 'p').contains((char) i)) {
                scoreMap.put((char) i, 3);
            } else if (Arrays.asList('f', 'h', 'v', 'w', 'y').contains((char) i)) {
                scoreMap.put((char) i, 4);
            } else if ('k' == (char) i) {
                scoreMap.put((char) i, 5);
            } else if (Arrays.asList('j', 'x').contains((char) i)) {
                scoreMap.put((char) i, 8);
            } else if (Arrays.asList('q', 'z').contains((char) i)) {
                scoreMap.put((char) i, 10);
            }

        }
        return scoreMap;
    }

    int getScore() {
        int sum = 0;
        for (int i = 0; i < this.word.length(); i++) {
            sum += this.scoreMap.get(this.word.charAt(i));
        }
        return sum;
    }

}
