class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> st = new Stack<>();

        String[] parts = path.split("/");

        for(int i=0; i<parts.length; i++) {

            if(parts[i].equals("") || parts[i].equals(".")) {
                continue;
            }

            if(parts[i].equals("..")) {
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(parts[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String str:st) {
            sb.append("/").append(str);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}