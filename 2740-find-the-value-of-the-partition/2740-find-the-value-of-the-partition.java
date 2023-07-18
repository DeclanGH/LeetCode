class Solution {
    public int findValueOfPartition(int[] nums) { 
        int minVal = 1000000001;
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
                minVal = Math.min(minVal, (nums[i] - nums[i-1]));
        }
        return minVal;
    }
}