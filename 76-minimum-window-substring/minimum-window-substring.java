class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n<m) return "";

        //first store the frequency of characters of t
        int[] freq = new int[128];
        for(char c:t.toCharArray()) {
            freq[c]++;
        }

        int l=0, r=0;
        int minWindowS = Integer.MAX_VALUE;
        int start=0; //to find substring
        int requiredCount=m;

        while(r<n) {
            char ch = s.charAt(r);

            if(freq[ch] > 0) {
                requiredCount--;
            }

            freq[ch]--;

            //found one window so shrinking the window
            while(requiredCount == 0) {
                int currentWindowS = r-l+1;

                if(minWindowS > currentWindowS) {
                    minWindowS = currentWindowS;
                    start = l;
                }

                freq[s.charAt(l)]++;

                if(freq[s.charAt(l)] > 0) {
                    requiredCount++;
                }

                l++;
            }

             r++;
        }

       return minWindowS == Integer.MAX_VALUE?"":s.substring(start, start+minWindowS);
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