class Solution {
    public String addStrings(String num1, String num2) {
        
        int sum = 0;
        int carry = 0;

        int n1 = num1.length();
        int n2 = num2.length();

        int i=n1-1;
        int j=n2-1;

        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0 || carry > 0) {
            sum = 0;
            if(i>=0) {
                sum += (num1.charAt(i)-'0');
                i--;
            }

            if(j>=0) {
                sum += (num2.charAt(j) - '0');
                j--;
            }

            if(carry != 0) {
                sum+=carry;
            }

            int base = sum%10;
            sb.insert(0, String.valueOf(base));
            carry = sum/10;
        }

        return sb.toString();
    }
}