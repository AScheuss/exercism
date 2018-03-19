import java.util.ArrayList;
import java.util.List;

class Sieve {
    private int maxPrime;

    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        ArrayList<Integer> primes = new ArrayList<>();
        if (maxPrime < 2) return primes;
        primes.add(2);
        for (int i = 1; i < Math.floor((maxPrime  - 1)/2 + 1); i++) {
            boolean isPrime = true;
            for (Integer prime : primes) {
                if ((2*i + 1) % prime == 0) isPrime = false;
            }
            if (isPrime) {
                primes.add(2*i + 1);
            }
        }
        return primes;
    }
}
