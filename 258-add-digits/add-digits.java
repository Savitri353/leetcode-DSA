class Solution {
    int sum = 0;
    public int addDigits(int num) {
        
        // while(num>=10) {
            
        //     int sum=0;
        //     while(num>=0) {
        //         sum += (num%10);
        //         num/=10;
        //     }

        //     num=sum;
        // }

        // return num;

        while(countDigit(num) > 1) {
            num = sum;
        }

        return sum;
    }

      int countDigit(int num) {
        int count = 0;
        sum = 0;
        while(num != 0) {
            sum += (num%10);
            num/=10;
            count++;
        }

        return count;
      }


}