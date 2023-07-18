class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k) return nums;
        int[] result = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        ArrayList<Integer> val = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            val.add(entry.getValue());
        }
        Collections.sort(val);

        int i = 0;
        for(int j = val.size()-1; j>=0; j--){
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue() == val.get(j)){
                    result[i] = entry.getKey();
                    map.remove(result[i]);
                    i++;
                    break;
                }
            }
            if(i == k){
                break;
            }
        }
        return result;
    }
}