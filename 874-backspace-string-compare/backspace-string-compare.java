class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st = new Stack<>();
         Stack<Character> st2 = new Stack<>();

        int n = s.length();
        int m = t.length();

        for(int i=0; i<n; i++) {
            char c=s.charAt(i);

            if(c == '#' && !st.isEmpty()) {
                st.pop();
            } else if(st.isEmpty() && c == '#') {
                continue;
            } else {
                st.push(c);
            }
        }

        for(int i=0; i<m; i++) {
            char c=t.charAt(i);

            if(c == '#' && !st2.isEmpty()) {
                st2.pop();
            } else if(st2.isEmpty() && c == '#') {
                continue;
            } else {
                st2.push(c);
            }
        }

        if(st.size() != st2.size()) {
            return false;
        }

        while(!st.isEmpty()) {
            if(st.pop() != st2.pop()) {
                return false;
            }
        }

        return true;
    }
}     