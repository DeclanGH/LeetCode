class Solution {
    public int longestSubarray(int[] nums) {
        int preZero = 0;
        int postZero = 0;
        int notOne = 0;
        int maxRes = 0; // max result

        for(int i=0; i<nums.length;){
            if(nums[i] == 1){
                preZero = ones(i, nums);
                i += preZero;
                maxRes = Math.max(maxRes, preZero);   
            }else{
                while(i<nums.length && nums[i] != 1){
                    notOne++; i++;
                }
                if(notOne > 1){
                    maxRes = Math.max(maxRes, preZero);
                }else{
                    postZero = ones(i, nums);
                    maxRes = Math.max(maxRes, preZero + postZero);
                    i += postZero;
                    preZero = postZero;
                }
                notOne = 0;
            }
        }
        if(maxRes == nums.length){
            return maxRes - 1;
        }
        return maxRes;
    }

    private static int ones(int i, int[] nums){
        int count = 0;
        while(i<nums.length && nums[i] == 1){
            count++;
            i++;
        }
        return count;
    }
}