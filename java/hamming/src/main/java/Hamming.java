class Hamming {

    private final int lengthOfStrand;
    private final StringBuilder leftStrand;
    private final StringBuilder rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = new StringBuilder(leftStrand);
        this.rightStrand = new StringBuilder(rightStrand);
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.lengthOfStrand = leftStrand.length();
    }

    int getHammingDistance() {
        int distance = 0;
        for (int i = 0; i < lengthOfStrand; i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }

}
