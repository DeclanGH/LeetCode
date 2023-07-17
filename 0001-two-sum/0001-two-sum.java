import java.util.HashMap;
import java.util.Map;
 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                return new int[] {numMap.get(target - nums[i]), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}
