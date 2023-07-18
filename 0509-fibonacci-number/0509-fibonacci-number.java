class Solution {
    public int fib(int n) { // 2nd approach, loop
        int base = 1;
        int fibN = 0; 
        while(n > 0){
            int temp = fibN;
            fibN += base;
            base = temp;
            n--;
        }
        return fibN;
    }
}