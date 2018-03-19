import java.util.stream.LongStream;

class NaturalNumber {

    private Classification classification;

    NaturalNumber(final long integer) {
        if (integer < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        long aliquotSum = calculateAliquotSum(integer);
        if (aliquotSum > integer) {
            classification = Classification.ABUNDANT;
        } else if (aliquotSum < integer) {
            classification = Classification.DEFICIENT;
        } else {
            classification = Classification.PERFECT;
        }
    }

    private long calculateAliquotSum(final long integer) {
        return LongStream.range(1, integer)
                .parallel()
                .filter(number -> integer % number == 0)
                .sum();
    }


    Classification getClassification() {
        return classification;
    }
}
