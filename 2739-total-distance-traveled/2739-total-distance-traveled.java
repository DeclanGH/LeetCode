class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int counter = 0;
        int remainder = 0;
        while(mainTank > 0){
            mainTank -= 5;
            if((mainTank > -1) && (additionalTank > 0) ){
                additionalTank--;
                mainTank++;
                counter++;
            }else if (mainTank < 0){
                remainder = mainTank + 5;
            }else counter++;
        }
        
        return ((counter * 5) + remainder) * 10;
        
    }
}