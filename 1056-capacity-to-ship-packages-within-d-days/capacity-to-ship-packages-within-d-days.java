class Solution {
    public int shipWithinDays(int[] weights, int days) {
        

        int left=weights[0];
        int right=0;

        for(int w:weights) {
            left = Math.max(left, w);
            right+=w;
        }

        while(left<=right) {
            int mid = left+(right-left)/2;

            if(canShip(weights, mid, days)) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }

        return left;
    }

    boolean canShip(int[] weights, int capacity, int d) {
        int actualD = 1;
        int currentWeight = 0;

        for(int w:weights) {

            if(currentWeight + w > capacity) {
                actualD++;
                currentWeight = 0;
            }

            currentWeight+=w;
        }

        return actualD<=d;
    }
}