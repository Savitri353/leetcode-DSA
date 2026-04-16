class Solution {
    public int largestRectangleArea(int[] ht) {
       
        Stack<Integer> st = new Stack<>();
        int n = ht.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        //first calculate next smaller element in right side
        for(int i=ht.length-1; i>=0; i--) {
            while(!st.isEmpty() && ht[st.peek()] >= ht[i]) {
                st.pop();
            }

            if(st.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        //in left
        for(int i=0; i<n; i++) {
            while(!st.isEmpty() && ht[st.peek()] >= ht[i]) {
                st.pop();
            }

            if(st.isEmpty()) {
                left[i] =-1;
            } else {
                left[i] = st.peek();
            }

            st.push(i);
        }

        int maxA = 0;
        for(int i=0; i<n; i++) {
            int w = right[i]-left[i]-1;
            maxA = Math.max(maxA, ht[i]*w);
        }

        return maxA;
    }
}