class Solution {
    public int trap(int[] height) {
        int trappedWater = 0;
        int lMin = 0;
        int lMax = 0;
        int rMin = height.length-1;
        int rMax = height.length-1;

        while(lMax != rMax){
            if(height[lMax] <= height[rMax]){
                lMax += 1;
                while(height[lMin] > height[lMax]){
                    lMax++;
                }
                trappedWater += height[lMin]*(lMax-lMin);
                while(lMin != lMax){
                    trappedWater -= height[lMin];
                    lMin++;
                }
            }else{
                rMax -= 1;
                while(height[rMin] > height[rMax]){
                    rMax--;
                }
                trappedWater += height[rMin]*(rMin-rMax);
                while(rMin != rMax){
                    trappedWater -= height[rMin];
                    rMin--;
                }
            }
        }
        return trappedWater;
    }
}