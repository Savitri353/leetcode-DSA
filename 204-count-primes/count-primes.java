class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];

        for(int i=2; i<n; i++) {
            isPrime[i] = true;
        }

        for(int i=2; i*i<n; i++) {

            if(isPrime[i] == true) {

                for(int j=2; j*i<n; j++) {
                    if(isPrime[j*i] == false) continue;
                    isPrime[j*i] = false;
                }
            }
        }

        int count = 0;
        for(int i=2; i<n; i++) {
            if(isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}