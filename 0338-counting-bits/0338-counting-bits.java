class Solution {
    public int[] countBits(int n) { // a better O(n) solution?
        int[] dp = new int[n+1];
        dp[0] = 0; // base
        int i = 1;
        int offset = 1;
        while(i <= n){ // its weird but works.
            dp[i] = 1 + dp[i-offset];
            i++;
            offset = (i%offset==0) ? offset *= 2 : offset;
        }
        return dp;
    }
}