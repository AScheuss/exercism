import java.util.Arrays;

class LargestSeriesProductCalculator {

    private int[] numbers;

    LargestSeriesProductCalculator(String inputNumber) {
        if (inputNumber.length() == 0) numbers = new int[]{};
        else if (!inputNumber.matches("[0-9]+")) throw new IllegalArgumentException("String to search may only contain digits.");
        else numbers = Arrays.stream(inputNumber.split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits > numbers.length) throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        else if (numberOfDigits < 0) throw new IllegalArgumentException("Series length must be non-negative.");

        int largestProduct = 0;
        for (int i = 0; i < numbers.length - numberOfDigits + 1; i++) {
            int tempProduct = 1;
            for (int j = 0; j < numberOfDigits; j++) tempProduct *=numbers[i+j];
            if (largestProduct < tempProduct) largestProduct = tempProduct;
        }
        return largestProduct;
    }
}
