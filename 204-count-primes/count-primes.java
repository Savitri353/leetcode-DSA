class Solution {
    public int countPrimes(int n) {

      boolean[] isPrime = new boolean[n];

      for(int i=2; i<n; i++) {
        isPrime[i] = true;
      }

      //marks multiples as false;

      for(int i=2; i*i<=n; i++) {
        for(int j=2; j*i<n; j++) {
            if(isPrime[j*i]) {
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