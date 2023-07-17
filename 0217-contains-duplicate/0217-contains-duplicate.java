class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> nums2 = new HashSet<>();

        for(int num : nums){  
            if(!nums2.add(num)){
                return true;
            }
        }
        return false;
    }
}