class Solution {
    public int[] sortedSquares(int[] nums) {
        
       int[] square = new int[nums.length];

       int left=0, right=nums.length-1;
       int index=nums.length-1;

       //as there are also negative elements, so larget square element will be from leftMost or from rightMost element

       while(left<=right) {
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];

            if(leftSquare<rightSquare) {
                square[index--] = rightSquare;
                right--;
            } else {
                square[index--] = leftSquare;
                left++;
            }
       }

       return square;
    }
}