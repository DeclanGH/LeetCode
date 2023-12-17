class AllOne {

    private HashMap<String, Integer> allOne;
    private HashMap<Integer, HashSet<String>> counter;

    public AllOne() {
        allOne = new HashMap<>();
        counter = new HashMap<>();
    }
    
    public void inc(String key) {
        if (allOne.containsKey(key)) {
            int newVal = allOne.get(key) + 1;
            allOne.put(key, newVal);
            counterHelper(newVal,key);
            counter.get(newVal-1).remove(key);
        } else {
            allOne.put(key, 1);
            counterHelper(1,key);
        }
    }

    private void counterHelper(int newVal, String key){
        if(counter.containsKey(newVal)) {
            counter.get(newVal).add(key);
        } else {
            counter.put(newVal, new HashSet<>(Set.of(key)));
        }
    }
    
    public void dec(String key) {
        int currCount = allOne.get(key);
        if (currCount == 1) {
            allOne.remove(key);
            counter.get(1).remove(key);
        } else {
            int newVal = allOne.get(key) - 1;
            allOne.put(key, newVal);
            counterHelper(newVal,key);
            counter.get(newVal+1).remove(key);
        }
    }
    
    public String getMaxKey() {
        String maxKey = "";
        int size = counter.size();
        for (int i=size; i>0; i--) {
            if (!counter.get(i).isEmpty()) {
                List<String> list = new ArrayList<>(counter.get(i));
                maxKey = list.get(0);
                break;
            }
        }
        return maxKey;
    }
    
    public String getMinKey() {
        String minKey = "";
        int size = counter.size();
        for (int i=1; i<size+1; i++) {
            if (!counter.get(i).isEmpty()) {
                List<String> list = new ArrayList<>(counter.get(i));
                minKey = list.get(0);
                break;
            }
        }
        return minKey;
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */