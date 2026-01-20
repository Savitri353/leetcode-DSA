class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int num1:nums1) {
            if(mp.containsKey(num1)) {
                mp.put(num1, mp.get(num1)+1);
            } else {
                mp.put(num1, 1);
            }
        }

        for(int num2:nums2) {
            if(mp.containsKey(num2) && mp.get(num2)>0) {
                result.add(num2);
                mp.put(num2, mp.get(num2)-1);
            }
        }

        int[] ans = new int[result.size()];

        int i=0;
        for(int a:result) {
            ans[i++] = a;
        }

        return ans;
    }
}