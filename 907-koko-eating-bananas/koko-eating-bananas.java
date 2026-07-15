class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int i=1;
        int j=0;

        for(int x:piles) {
            j = Math.max(j, x);
        }

        while(i<=j) {

            int mid = i+(j-i)/2; //k

            if(canEatAll(piles, mid, h)) {
                j = mid-1;
            } else {
                i = mid+1;
            }
        }

        return i;
    }

    public boolean canEatAll(int[] piles,int k, int h) {

        long actualHours = 0;

        for(int x:piles) {
            actualHours+=x/k;

            if(x%k !=0) {
                actualHours++;
            }
        }

        return actualHours<=h;
    }
}       