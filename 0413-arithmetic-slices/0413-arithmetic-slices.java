class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if(nums.length < 3){
            return 0;
        }
        
        int subarrayCount = 0;
        
        PriorityQueue<Integer> countsAscending = new PriorityQueue<>((a, b) -> Integer.compare(a, b));
        HashMap<Integer, Integer> countMultiplier = new HashMap<>();
        
        int i = 0;
        
        while (true) {
            
            int count = 0;
            int j = i+1;
            int difference = nums[i]-nums[j];
            
            while (j<nums.length && nums[i]-nums[j] == difference) {
                count += 1;
                i+=1; j+=1;
            }
            
            int subCount = count - 1;
            
            if (!countMultiplier.containsKey(subCount) && count >= 2) {
                countsAscending.add(subCount);
                countMultiplier.put(subCount, 1);
            } else if (count >= 2) {
                countMultiplier.put(subCount, countMultiplier.get(subCount) + 1);
            }    
            
            if (j >= nums.length) break;
        }
        
        int itr = 1;
        int currTotal = 0;
            
        while (!countsAscending.isEmpty()) {
            int currCount = countsAscending.poll();
            while (itr <= currCount) {
                currTotal += itr;
                itr++;
            }
            subarrayCount += currTotal * countMultiplier.get(currCount);
        }
        
        return subarrayCount;
    }
}