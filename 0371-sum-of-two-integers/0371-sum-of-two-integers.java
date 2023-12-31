class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int temp = (a & b) << 1; // this is the carry value (we wanna know beforehand)
            a ^= b; // this solves the sum with carry unitl zero carries. 
            b = temp;
        }
        return a;
    }
}

// class Solution { // easier to understand code
//     public int getSum(int a, int b) {
//         while(b !=0 ){
//             int answer = a ^ b;
//             int carry = (a & b) << 1;
//             a = answer;
//             b = carry;
//         }
//         return a;
//     }
// }