class Solution {
    public String minWindow(String s, String t) {
        
        int m = s.length();
        int n = t.length();

        if(m<n) return "";

        //store freq of t 
        int[] freq = new int[128];
        for(char c:t.toCharArray()) {
            freq[c]++;
        }

        int minL = Integer.MAX_VALUE;
        int r=0, l=0;
        int start = 0;
        int requiredCount = n;
        while(r<m) {
            int ch = s.charAt(r);
            if(freq[ch] > 0) {
                requiredCount--;
               
            }

             freq[ch]--;
             while(requiredCount == 0) {

                //that means we found one ans
                int currentWin = r-l+1;

                if(currentWin < minL) {
                    start = l;
                    minL = currentWin;
                }

                //srink window from left

                freq[s.charAt(l)]++;

                if(freq[s.charAt(l)] > 0) {
                    requiredCount++;
                }

                l++;
             }

             r++;
        }

        return minL == Integer.MAX_VALUE?"":s.substring(start, start+minL);
    }
}

// 👉 1. Store freq of t, set requiredCount = t.length()

// 👉 2. Expand (r)

            // If freq[s[r]] > 0 → requiredCount--
            // Decrease freq[s[r]]

// 👉 3. When requiredCount == 0

            // Update min window
            // Shrink (l):
            // Increase freq[s[l]]
            // If freq[s[l]] > 0 → requiredCount++
            // Move l

// 👉 4. Repeat till end

// 👉 5. Return smallest substring

// Expand → requiredCount 0 → shrink → update