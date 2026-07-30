class Solution {
    public String decodeString(String s) {
       Stack<Integer> stDigit = new Stack<>();
       Stack<String> stChar = new Stack<>();

       int num = 0;

       for(int i=0; i<s.length(); i++) {

            if(Character.isDigit(s.charAt(i))) {
                num = num*10+(s.charAt(i) - '0');
            } else if(s.charAt(i) == '[') {
                stDigit.push(num);
                num=0;
                stChar.push(String.valueOf(s.charAt(i)));
            } else if(s.charAt(i) == ']') {

                StringBuilder sb = new StringBuilder();

                while(!stChar.peek().equals("[")) {
                    sb.insert(0, stChar.pop());
                }

                 stChar.pop();

                int count = stDigit.pop();
                String repeated = sb.toString().repeat(count);
                stChar.push(repeated);

            } else {
                stChar.push(String.valueOf(s.charAt(i)));
            }
       }

        StringBuilder sb = new StringBuilder();
       for(String ans: stChar) {
            sb.append(ans);
       }

       return sb.toString();
    }
}