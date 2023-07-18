class Solution {
    public String intToRoman(int num) {
        // Create a dictionary for the special values. So yes, hardcode them.
        int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] rom={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String romNum = "";
        int i = 0;

        while(num != 0){
            if(num >= val[i]){
                romNum += rom[i];
                num -= val[i];
            }else{i++;}
        }
        return romNum;
    }
}