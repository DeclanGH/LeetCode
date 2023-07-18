class Solution {
    public void wiggleSort(int[] nums) {
        // Attempt 2. This time, sorting the array.
        int[] clone = nums.clone();
        Arrays.sort(clone);
        int i = 0;
        int j = 0;
        int leftPtr = 0;
        int rightPtr = clone.length-1;
        int temp;
        while(leftPtr <= rightPtr){
            if(i%2 == 0){
                nums[i] = clone[leftPtr];
                leftPtr++;
                if(i != 0 && nums[i] == nums[i-1]){
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    j += 2;
                }
                i++;
            }else if(i%2 != 0){
                nums[i] = clone[rightPtr];
                rightPtr--;
                if(i != 0 && nums[i] == nums[i-1]){
                    temp = nums[j];
                    nums[j] = nums[i-1];
                    nums[i-1] = temp;
                    j += 2;
                }
                i++;
            }
        }
    }
}