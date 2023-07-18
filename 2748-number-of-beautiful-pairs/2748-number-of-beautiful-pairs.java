class Solution {
    public int countBeautifulPairs(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++){
            int ii = nums[i];
            while(ii >= 10){
                ii /= 10;
            }
            for(int j=i+1; j<nums.length; j++){
                int jj = nums[j] % 10;
                int max = Math.max(ii, jj);
                int min = (ii + jj) - max;
                if(ii == 1 || jj == 1){ 
                    result++;
                }else if(((ii % 2 == 0) && (jj % 2 == 0)) || ((ii % 3 == 0) && (jj % 3 == 0))){ //exceptions to mod greater than zero.
                    ;
                }else if((max % min) > 0){ 
                    result++;
                }
            }
        }
        return result;
    }
}