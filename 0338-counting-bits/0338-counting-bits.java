class Solution {
    public int[] countBits(int n) {
        int[] bitCount = new int[n+1];
        int count = n;
        while(count != 0){ // This is O(n)
            int ones = 0;
            n = count;
            while(n != 0){ // This is an O(1) while loop
                n &= (n-1);
                n >>>= 1;
                ones += 1;
            }
            bitCount[count] = ones;
            count--;
        }
        return bitCount; // Therefore this solution is O(n)
    }
}