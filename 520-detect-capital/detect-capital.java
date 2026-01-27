class Solution {
    public boolean detectCapitalUse(String word) {
        
        //if first character is uppercase then there will be two case, either only first or whole string will be into uppercase
       if(word.length() == 1) return true;
        if(Character.isUpperCase(word.charAt(0))) { 
            if(Character.isUpperCase(word.charAt(1))) {

                 for(int i=2; i<word.length(); i++) {
                    if(!Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
                 }

            } else {

                for(int i=1; i<word.length(); i++) {
                    if(Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
                 }
            }      
        } else {
            for(int i=0; i<word.length(); i++) {
                    if(Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
            }
        }   

        return true;    
    }
}