class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> total = new ArrayList<>();
        int carry = 0;
        for(int i=num.length-1; i>=0; i--){
            int currSum = num[i] + k%10 + carry; // current sum 
            if(currSum >= 10){
                total.add(currSum % 10);
                carry = 1;
            }else{
                total.add(currSum);
                carry = 0;
            }
            k /= 10;
        }
        if(k > 0){
            while(k > 0){
                int sum = k%10 + carry;
                if(sum >= 10){
                    total.add(sum % 10);
                    carry = 1;
                }else{
                    total.add(sum);
                    carry = 0;
                }
                k /= 10;
            }
        }
        if(carry == 1){
            total.add(1); // we got to the end and carry has 1? add it.
        }
        
        Collections.reverse(total);
        return total;
    }
}