class Solution {
    public int reverse(int x) {
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long res = 0;
        while(x != 0){
            res += (x%10); // add the last bit to result
            x /= 10;       // divide the integer by 10 to right shift
            res *= (x != 0) ? 10 : 1; // multiply result by 10 if not x == 0
        }
        return (res >= minInt && res <= maxInt) ? (int)res : 0;
    }
}

