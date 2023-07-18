class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] res = new boolean[nums.length+1];
        for(int i=0; i<nums.length; i++){
            if(res[nums[i]] == false){
                res[nums[i]] = true;
            }else return nums[i];
        }
        return 0;
    }
}