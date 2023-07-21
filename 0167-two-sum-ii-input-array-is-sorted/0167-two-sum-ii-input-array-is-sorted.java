class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = nums.length-1;
        while(true){ // Because no edge case. There must be a result
            if(nums[i] + nums[j] < target){
                i++;
            }else if(nums[i] + nums[j] > target){
                j--;
            }else{ // else equal
                return new int[] {i+1,j+1};
            }
        }
    }
}