import java.util.HashSet;

class SumOfMultiples {

    private final int number;
    private final int[] set;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        HashSet<Integer> multiples = new HashSet<>();
        for (int i : set) {
            for (int j = 1; j*i < number; j++) {
                multiples.add(j*i);
            }
        }

        return multiples.stream().reduce(0, Integer::sum);
    }

}
