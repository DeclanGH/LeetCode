class Solution {
    public int rotatedDigits(int n) {
        int counter = 0;
        
        for(int i=1; i < n+1; i++){
            int thous = i/1000;
            int hunds = (i%1000)/100;
            int tens = (i%100)/10;
            int unit = i%10;
            boolean valid = isValid(thous, hunds, tens, unit);
            if(valid){
                counter++;
            }
        }
        return counter;
    }
    
    private static boolean isValid(int thous, int hunds, int tens, int unit){
        int[] n = {unit,tens,hunds,thous};
        int j = 0;
        for(int i=0; i<4;){
            if(n[i] == 3 || n[i] == 4 || n[i] == 7){
                return false;
            }else if(n[i] == 2 || n[i] == 5 || n[i] == 6 || n[i] == 9){
                i++;
            }else{
                j++;
                i++;
            }
        }
        return j != 4;
    }
}