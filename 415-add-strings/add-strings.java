class Solution {
    

    public String addStrings(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int i=n1-1;
        int j=n2-1;
        while(i>=0 && j>=0) {
            
            int ans = (num1.charAt(i)-'0') + (num2.charAt(j)-'0') + carry;
                
            int digit = ans%10;
            carry = ans/10;
            sb.append(digit);
                  
            i--;
            j--;
        }
        
        while(i>=0) {
            if(carry != 0) {
                int ans = (num1.charAt(i)-'0') + carry;
                int digit = ans%10;
                carry = ans/10;
                sb.append(digit);
            } else {
                sb.append(num1.charAt(i));
            }

            i--;
        }

        while(j>=0) {
            if(carry != 0) {
                int ans = (num2.charAt(j)-'0') + carry;
                int digit = ans%10;
                carry = ans/10;
                sb.append(digit);
               
            } else {
                sb.append(num2.charAt(j));
            }
            j--;
        }

        if(carry>0) sb.append(carry);
        
        return sb.reverse().toString();
    }
}