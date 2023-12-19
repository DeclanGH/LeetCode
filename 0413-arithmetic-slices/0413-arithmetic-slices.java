class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if (nums.length < 3) return 0;
        
        int subarrayCount = 0;
                
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
            
            if (count >= 2) subarrayCount += (int) ((subCount/2.0) * (2 + (subCount-1)));
            
            if (j >= nums.length) break;
        }

        return subarrayCount;
    }
}