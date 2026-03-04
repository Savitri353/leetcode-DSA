class Solution {
    public boolean isPowerOfTwo(int n) {
    //     // Base case: negative numbers and 0 are not power of two
    //    if(n<=0) {
    //     return false;
    //    }

    //    // Base case: 1 is power of two (2^0)
    //    if(n==1) {
    //     return true;
    //    }
       
    //    // If n is odd, it cannot be power of two
    //    if(n%2 != 0) {
    //     return false;
    //    } else

    //     // Recursive call
    //    return isPowerOfTwo(n/2);

    //without usign recursion

        // Power of two numbers always have one in binary
        return n>0 && (n & (n-1)) == 0;
     }
}