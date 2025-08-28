class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
            backtrack(list, n, "", 0, 0);
            return list;

    }

    public void backtrack(List<String> list, int n, String current, int open, int close) {
        if(current.length()==n*2) {
            list.add(current);
            return;
        }

        if(open<n) {
            backtrack(list, n, current+'(', open+1, close);
        }

        if(close<open) {
            backtrack(list, n, current+')', open, close+1);
        }
    }
}