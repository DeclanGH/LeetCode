class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k) return nums;

        // updated version 
        int[] result = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(map::get).reversed());

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        pq.addAll(map.keySet());

        int counter = 0;
        while (counter < k) {
            result[counter] = pq.poll();
            counter++;
        }

        return result;
    }
}