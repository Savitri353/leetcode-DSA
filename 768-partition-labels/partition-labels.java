class Solution {
    public List<Integer> partitionLabels(String s) {

        //keep track the last index for each character in string
        int n = s.length();
        int[] last = new int[26];

        for(int i=0; i<n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        List<Integer> ans = new ArrayList<>();

        //we will keep the track of three pointers

        int start = 0;
        int end  = 0;

        for(int i=0; i<n; i++) {
            end = Math.max(end, last[s.charAt(i)-'a']);

            if(end == i) {
                ans.add(end-start+1);
                start = i+1;
            }
        }

        return ans;
    }
}       