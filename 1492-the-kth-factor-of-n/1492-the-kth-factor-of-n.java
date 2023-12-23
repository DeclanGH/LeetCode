class Solution {
    public int kthFactor(int n, int k) {

        int counter = 0;
        int i=1;

        while (counter < k) {
            if (n % i == 0) counter += 1;
            if (i > n) return -1;
            i++;
        }

        return i-1;
    }
}