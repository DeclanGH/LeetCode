public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0; // result
        int size = 1;
        boolean negative = n < 0; // to solve left shift errors with signed ints
        while(size <= 31){
            res += n%2;
            res <<= 1;
            n >>>= 1;
            size++;
        }
        return res = negative ? res+1 : res;
    }
}