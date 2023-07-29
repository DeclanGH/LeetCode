class Solution {
    public int search(int[] nums, int target) {
        int a = 0; // pointer at the start
        int z = nums.length-1; // pointer at the end
        
        while(true){
            int mid = (a + z)/2; // pointer at the middle
            if(nums[a] == target){
                return a;
            }else if(nums[z] == target){
                return z;
            }else if(nums[mid] < target && a != mid){
                a = mid;
            }else if(nums[mid] > target && z != mid){
                z = mid;
            }else if(nums[mid] == target){
                return mid;
            }else{
                break;
            }
        }

        return -1;
    }
}