public class PangramChecker {

    public boolean isPangram(String input) {
        String normalizedInput = input.toLowerCase();
        for (int i = (int) 'a'; i < (int) 'z'; i++) {
            char ch = (char) i;
            if ((normalizedInput.indexOf(ch) < 0)) {
                return false;
            }
        }
        return true;
    }

}
