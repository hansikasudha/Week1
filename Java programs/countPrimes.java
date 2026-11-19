class countPrimes {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        
        // isPrime[i] will be true if i is prime, false otherwise
        boolean[] isPrime = new boolean[n];
        java.util.Arrays.fill(isPrime, true);
        
        // 0 and 1 are not prime numbers
        isPrime[0] = false;
        isPrime[1] = false;
        
        // Sieve of Eratosthenes
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p as non-prime starting from p * p
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        // Count all remaining true values
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}