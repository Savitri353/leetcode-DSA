class Solution {
    public int[] dailyTemperatures(int[] t) {

        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=t.length-1; i>=0; i--) {
            while(!st.isEmpty() && t[st.peek()] <= t[i]) {
                st.pop();
            }

            if(st.isEmpty()) {
                mp.put(i, 0);
            } else {
                mp.put(i, st.peek()-i);
            }

            st.push(i);
        }

        int[] ans = new int[t.length];
        for(int i=0; i<ans.length; i++) {
            ans[i] = mp.get(i);
        }

        return ans;
    } 
}      