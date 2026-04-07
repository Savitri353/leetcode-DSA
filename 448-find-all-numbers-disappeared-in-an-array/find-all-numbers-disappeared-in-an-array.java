class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> list = new ArrayList<>();

       int n = nums.length;
       int i=0;
       while(i<n) {
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
       }

       for(i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
                list.add(i+1);
            }
       }

       return list;
    }
}
//Since numbers are in the range 1 to n, I use cyclic sort to place each number at index value - 1. After that, any index where the value is not i + 1 represents a missing number.