class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int[] rs = new int[n+m];

        int i=0, j=0,k=0;
        while(i<n && j<m) {

            if(nums1[i] <= nums2[j]) {
                rs[k++] = nums1[i++];
            } else {
                rs[k++] = nums2[j++];
            }
        }

        while(i<n) {
            rs[k++] = nums1[i++];
        }

         while(j<m) {
            rs[k++] = nums2[j++];
        }


        int r = n+m;
        if(r%2 == 0) {
            return (double)( rs[r/2] + rs[r/2 - 1])/2;
        } 
         return (double) (rs[r/2]);
    
    }
}     