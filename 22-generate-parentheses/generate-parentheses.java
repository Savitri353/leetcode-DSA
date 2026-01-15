class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        solve(list, 0, 0, n, new StringBuilder());
        return list;
    }

    public void solve(List<String> list, int open, int close, int n, StringBuilder temp) {
        if(temp.length() == 2*n) {
            list.add(temp.toString());
        }

        //take open bracket , if it is valid
        if(open<n) {
            temp.append("("); //take
            solve(list, open+1, close, n, temp); //explore
            temp.deleteCharAt(temp.length()-1); // undo
        }

        //take close bracket, if it is valid
        if(close<open) {
            temp.append(")"); //take
            solve(list, open, close+1, n, temp); //explore
            temp.deleteCharAt(temp.length()-1); //undo
        }
    }
}    