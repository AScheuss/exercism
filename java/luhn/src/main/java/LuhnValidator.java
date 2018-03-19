import java.util.Arrays;

class LuhnValidator {

    boolean isValid(String candidate) {
        String trimedCandidate = candidate.replace(" ", "");
        if (!trimedCandidate.matches("[0-9]+") || trimedCandidate.length() < 2) {
            return false;
        }

        int[] numbers = Arrays.stream(trimedCandidate.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = numbers.length-1; i >= 0; i--) {
            if ((numbers.length - i) % 2 == 0) {
                int toDouble = 2 * numbers[i];
                if (toDouble > 9) {
                    sum += toDouble - 9;
                } else {
                    sum += toDouble;
                }
            } else {
                sum += numbers[i];
            }
        }

        return sum % 10 == 0;
    }

}
