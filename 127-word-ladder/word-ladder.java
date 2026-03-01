class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        //store all words in hashset for O(1) lookup
        HashSet<String> set = new HashSet<>(wordList);

        //If end word is not possible in wordlist, TransFormation is impossible
        if(!set.contains(endWord)) return 0;

        //Queue For BFS traversal
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);

        //Level represents the number of transformatioms
        int level = 1;

        //perform BFS
        while(!q.isEmpty()) {
            int size = q.size();

            //Process all words at the current level
            for(int i=0; i<size; i++) {
                String word = q.poll();

                //if we reach the target word, return level
                if(word.equals(endWord)) return level;
                
                //convert word to character array for easy modification
                char[] arr = word.toCharArray();

                //try changing each character of the word
                for(int j=0; j<arr.length; j++) {

                    char original = arr[j]; //store original character

                    //try replacing with all letters from 'a' to 'z'
                    for(char c = 'a'; c<='z'; c++) {
                        arr[j] = c;
                        String newWord = new String(arr);

                        //if the new word exists in the set
                        if(set.contains(newWord)) {

                            q.add(newWord); //Add to queue for next level
                            set.remove(newWord); //Remove to avoid revisiting
                        }
                    }

                    //Restore original character before moving to next position
                    arr[j] = original;    
                }
            }
            //Increament level after finishing one BFS layer
            level++;
        }

        //If no transformation sequence found
        return 0;
    }
}