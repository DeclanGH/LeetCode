class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(true){
            int mid = (right + left)/2;
            if(nums[mid] == target){
                return mid;
            }else if((right - left > 1) && nums[mid] < target){
                left = mid;
            }else if((right - left > 1) && nums[mid] > target){
                right = mid;
            }else break;
        }
        if(target <= nums[left]){
            return left;
        }else if(target > nums[right]){
            return right + 1;
        }
        return right;
    }
}