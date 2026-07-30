class Solution {
    public String reverseVowels(String s) {
        
        int i=0, j=s.length()-1;
        char[] arr = s.toCharArray();

        while(i<j) {
            while(i<j && !isVowel(arr[i])) i++;
            while(i<j && !isVowel(arr[j])) j--;

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}