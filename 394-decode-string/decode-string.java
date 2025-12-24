class Solution {
    public String decodeString(String s) {
        Stack<Integer> stNum = new Stack<>();
        Stack<String> stChar = new Stack<>();
        int num=0;
        
        for(int i=0; i<s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                num = num*10+(s.charAt(i)-'0');
                
            } else if(s.charAt(i) == '['){
                
                stNum.push(num);
                stChar.push("[");
                num=0;
            
            } else if(s.charAt(i) == ']'){
                StringBuilder str = new StringBuilder();
                
                while(!stChar.peek().equals("[")) {
                    str.insert(0, stChar.pop());
                }
                stChar.pop();
                int count = stNum.pop();
                String repeated = str.toString().repeat(count);
                stChar.push(repeated);

                
            } else {
                stChar.push(String.valueOf(s.charAt(i)));
            }
        }
        StringBuilder mainAns = new StringBuilder();
        for(String ans:stChar) {
            mainAns.append(ans);
        }
        return mainAns.toString();
    }
}