/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(isBadVersion(1)){
            return 1;
        }
        int first = 2;
        long last = n;
        while(last-first > 1 ){
            long math = (first + last)/2;
            int mid = (int) math;
            if(isBadVersion(mid)){
                last = mid;
            }else{
                first = mid;
            }
        }
        return (isBadVersion(first)) ? first : (int)last;
    }
}