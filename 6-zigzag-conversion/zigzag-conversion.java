class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows == 1) return s;

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<numRows; i++) {
            int idx = i;
            int southIdx = 2*(numRows-1-i);
            int northIdx = 2*i;

            boolean southDir = true;

            while(idx<s.length()) {
                sb.append(s.charAt(idx));

                if(i==0) {
                    idx+=southIdx;
                } else if(i==numRows-1) {
                    idx+=northIdx;
                } else {

                    if(southDir) {
                         idx+=southIdx;
                    } else {
                        idx+=northIdx;
                    }

                    southDir = !southDir;
                }
            }
        }

        return sb.toString();
    }
}