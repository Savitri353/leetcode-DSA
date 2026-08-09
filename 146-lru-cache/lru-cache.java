class LRUCache {

    //store key-value pairs
    ArrayList<int[]> cache;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new ArrayList<>();
    }
    
    public int get(int key) {
        for(int i=0; i<cache.size(); i++) {
            if(cache.get(i)[0] == key) {
                
                //store key, value
                int[] pair = cache.remove(i);

                //put it at the end
                cache.add(pair);
                return pair[1];
            }
        }

        return -1;
    }
    
    public void put(int key, int value) {
        for(int i=0; i<cache.size(); i++) {

            if(cache.get(i)[0] == key) {
                cache.remove(i);

                cache.add(new int[] {key, value});

                return;
            }
        }

        if(cache.size() == capacity) {
            cache.remove(0);
        }

        cache.add(new int[] {key, value});
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */