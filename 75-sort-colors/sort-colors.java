class Solution {
    public void sortColors(int[] nums) {
        //instead of comparing with previous element i am gonna use frequancy count for each element in arr. counting sort O(n+k). with extra space
        
       // before counting frequancy i need to know the size of count that is going to be max element from array

       int max = nums[0];
       for(int i=1; i<nums.length; i++) {
            max = Math.max(max, nums[i]);
       }

       int[] count = new int[max+1]; //frequancy array
       for(int i=0; i<nums.length; i++) {
            count[nums[i]]++;
       }

       //now rebuild arr, sorting
       int index = 0;
       for(int i=0; i<count.length; i++) {
            while(count[i]>0) {
                nums[index++] = i;
                count[i]--;
            }
       }

    }
}