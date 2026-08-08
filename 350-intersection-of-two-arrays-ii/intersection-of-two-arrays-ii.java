class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> list  = new ArrayList<>();

        for(int num:nums2) {
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }  

        for(int num:nums1) {
            if(mp.getOrDefault(num, 0)>0) {
               list.add(num);
               mp.put(num, mp.get(num)-1);
            }
        }

        int[] ans = new int[list.size()];
        int i=0;
        for(int e:list) {
            ans[i++] = e;
        }
        return ans;
    }
}