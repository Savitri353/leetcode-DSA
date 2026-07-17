class Solution {
    public void sortColors(int[] nums) {
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        for(int n:nums) {
            if(n == 0) {
                countZero++;
            } else if(n == 1) {
                countOne++;
            } else {
                countTwo++;
            }   
        }

        int i=0;
        while(countZero>0) {
            nums[i++] = 0;
            countZero--;
        }

        while(countOne>0) {
            nums[i++] = 1;
            countOne--;
        }

        while(countTwo>0) {
            nums[i++] = 2;
            countTwo--;
        }
    }
}    