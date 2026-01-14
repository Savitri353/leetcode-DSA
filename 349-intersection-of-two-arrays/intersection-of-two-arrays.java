class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums1.length; i++) {
            int first = nums1[i];
            for(int j=0; j<nums2.length; j++) {
                if(first == nums2[j]) {
                    set.add(first);
                    break;
                }
            }
        }

        int[] arr = new int[set.size()];
        int i=0;
        for(int sum:set) {
            arr[i++] = sum;
        }

        return arr;
    }
}