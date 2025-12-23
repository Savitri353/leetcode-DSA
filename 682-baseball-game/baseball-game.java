class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int result = 0;
        for(int i=0; i<operations.length; i++) {
            if(operations[i].equals("+")&& st.size()>=2) {
                    int second = st.peek();
                    int second1 = st.pop();
                    int first = st.peek();
                    st.push(second1);
                    st.push(first+second);
            } else if(operations[i].equals("D") && !st.isEmpty()) {
                st.push(st.peek()*2);
            } else if(operations[i].equals("C")  && !st.isEmpty()) {
                st.pop();
            } else {
                st.push(Integer.parseInt(operations[i]));
            }
        }

         while(!st.isEmpty()) {
                    result+=st.pop();
                }

        return result;
    }
}