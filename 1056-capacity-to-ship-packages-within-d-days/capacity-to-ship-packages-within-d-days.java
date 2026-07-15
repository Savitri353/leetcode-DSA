class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
       int left = weights[0];
       int right = 0;

       for(int x:weights) {
          
          left = Math.max(left, x);
          right+=x;
       }

       while(left <= right) {
         
         int mid = left + (right-left)/2; //mid is capacity

         if(canShip(weights, mid, days)) {
            right = mid-1;
         } else {
            left = mid+1;
         }
       }

       return left;
    }

    public boolean canShip(int[] w, int capacity, int days) {

            int actualD = 1;
            int currentW = 0;

            for(int x:w) {

                if(currentW + x > capacity) {
                    actualD++;
                    currentW = 0;
                }
                currentW+=x;
            }

            return actualD<=days;
    }
}