class Solution {
    public int compress(char[] chars) {
        
        int i=0;
        int k=0;

        while(i<chars.length) {

            char curr = chars[i];
            int count = 0;
            while(i<chars.length && curr == chars[i]) {
                count++;
                i++;
            }

            chars[k++] = curr;

            if(count>1) {
                String str = String.valueOf(count);
                // String str =  new String(count);

                for(char c:str.toCharArray()) {
                    chars[k++] = c;
                }
            }
        }

        return k;
    }
}