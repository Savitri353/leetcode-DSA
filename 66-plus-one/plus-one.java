class Solution {
    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1; i>=0; i--) {
            if(digits[i]<9) {
                digits[i]+=1;
                return digits;
            }

            //if digits[i] is 9 then add 0
            digits[i] = 0;
        }

        //if all digits are 9
        int[] result = new int[digits.length+1];
        result[0] = 1;

        return result;
    } 
}