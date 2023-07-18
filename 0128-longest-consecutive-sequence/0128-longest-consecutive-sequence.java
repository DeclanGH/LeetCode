class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){return 0;}
        Set<Integer> numSet = new HashSet<>();
        for(int i : nums){
            numSet.add(i);
        }
        int max = 1;
        int counter = 1;
        for(int i=0; i<nums.length; i++){
            int currNum = nums[i];
            if(!numSet.contains(currNum-1)){
                while(numSet.contains(currNum+1)){
                counter++;
                currNum += 1;
                }
            }
            max = Math.max(max,counter);
            counter = 1;
        }
        return max;
    }
}