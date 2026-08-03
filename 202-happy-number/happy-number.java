class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while(n!=1) {
            seen.add(n);
            int sum = 0;
            while(n>0) {
                int digit = n%10;
                sum+=(digit*digit);
                n/=10;
            }

            if(seen.contains(sum)) {
                return false;
            }

            n = sum;
           
        }

        return true;

    }
}