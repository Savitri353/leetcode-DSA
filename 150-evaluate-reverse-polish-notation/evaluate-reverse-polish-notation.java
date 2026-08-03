class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<tokens.length; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")) {
                int n2 = st.pop();
                int n1 = st.pop();

                int result = 0;

                switch(tokens[i]) {
                    case "+":result = n1+n2; break;
                    case "-":result = n1-n2; break;
                    case "/":result = n1/n2; break;
                    case "*":result = n1*n2; break;
                }

                st.push(result);
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }

        return st.pop();
    }
}