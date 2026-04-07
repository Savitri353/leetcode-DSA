class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums1.length; i++) {
            if(mp.containsKey(nums1[i])) {
                mp.put(nums1[i], mp.get(nums1[i])+1);
            } else {
                mp.put(nums1[i], 1);
            }
        }

        for(int i=0; i<nums2.length; i++) {
            if(mp.containsKey(nums2[i]) && mp.get(nums2[i]) >= 1) {
                list.add(nums2[i]);
                mp.put(nums2[i], mp.get(nums2[i])-1);
            } 
        }

        int[] arr = new int[list.size()];
        int i=0;
        for(int l:list) {
            arr[i++] = l;
        }

        return arr;
    }
}
//I use a frequency map for the first array and then iterate over the second array, adding elements to the result list while decreasing their count