class Solution {
    public int climbStairs(int n) {
        int one = 1;
        int two = 1;

        while((n-1) > 0){
            int temp = one;
            one += two;
            two = temp;
            n--;
        }
        return one;
    }
}