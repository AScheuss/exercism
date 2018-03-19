class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return (int) Math.pow((input * (input + 1))/2, 2);
    }

    int computeSumOfSquaresTo(int input) {
        return (int) (2*Math.pow(input, 3) + 3*Math.pow(input, 2) + input) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
