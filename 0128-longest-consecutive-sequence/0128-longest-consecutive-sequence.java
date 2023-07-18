class Solution {
    public int longestConsecutive(int[] nums) {
        // Original solution was definitely O(n) but ran 463ms 
        // I would try O(nlog(n)) solution and see how that goes...
        if(nums.length == 0){return 0;}
        Arrays.sort(nums);
        int i = 0;
        int j = -1;
        int max = 1;
        while(i < nums.length){
            if((i != (nums.length-1)) && (nums[i]+1 == nums[i+1])){
                i++;
            }else if((i != (nums.length-1)) && (nums[i] == nums[i+1])){
                i++;
                j++;
            }else{
                max = Math.max(max, (i-j));
                j=i;
                i++;
            }
        }
        return max;
    }
}