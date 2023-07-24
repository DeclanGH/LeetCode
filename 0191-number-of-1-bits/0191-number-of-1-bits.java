public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;
        while(n != 0){ // Faster solution i learned from NeetCode
            n &= (n-1);
            ones += 1; 
        }
        return ones;
    }
}