class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> st = new Stack<>();
        String[] parts = path.split("/");
        
        for(int i=0; i<parts.length; i++) {
            if(parts[i].equals("") || parts[i].equals(".")) {
                continue;
            } else if(parts[i].equals("..")) {
                if(!st.isEmpty()) {
                    st.pop();
                }
               
            } else {
                 st.push(parts[i]);
            }   
        }

        StringBuilder str = new StringBuilder();
        for(String dir:st) {
            str.append("/").append(dir);
        }

        return str.length() == 0?"/":str.toString();
    }
}