class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] postfix = new int[nums.length+1]; // the O(1) extra space
        postfix[nums.length] = 1;

        for(int i=nums.length-1; i>=0; i--){ // filling the postfix array
            postfix[i] = postfix[i+1] * nums[i];
        } 

        int mul = 1; // consider this my prefix
        for(int i=0; i<nums.length; i++){
            answer[i] = mul * postfix[i+1];
            mul *= nums[i];
        }
        return answer;
    }
}