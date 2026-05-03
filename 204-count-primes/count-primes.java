class Solution {
    public int countPrimes(int n) {

        boolean[] prime = new boolean[n];

        //intitally say all the numbers are prime numbers
        for(int i=2; i<n; i++) {
            prime[i] = true;
        }

        //now apply seive 
        for(int i=2; i*i<=n; i++) {
            if(prime[i] == true) {
                for(int j=2; j*i<n; j++) {
                    prime[j*i] = false;
                }
            }
        }

        int count = 0;

        for(int i=2; i<n; i++) {
            if(prime[i]) count++;
        }

        return count;
    }
}