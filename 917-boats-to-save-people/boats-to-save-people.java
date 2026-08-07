class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);

       int i=0, j=people.length-1;
        int boat = 0;
       while(i<=j) {

            if(people[j] == limit || people[i] == limit) {
                if(people[i] == limit) {
                    boat++;
                    i++;
                }

                if(people[j] == limit) {
                    boat++;
                    j--;
                }

            } else if(people[i] + people[j] > limit) {
                boat++;
                j--;
            } else if(people[i] + people[j] == limit) {
                boat++;
                i++;
                j--;
            } else {
                boat++;
                i++;
                j--;
            }
       }

       return boat;
    }
}