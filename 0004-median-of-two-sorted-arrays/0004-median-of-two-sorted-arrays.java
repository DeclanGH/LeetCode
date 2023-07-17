class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int counter = 0; // counter
        int i = 0; int j = 0; // Pointers 
        int m = nums1.length;  // pointer i moves wrt m
        int n = nums2.length;  // pointer j moves wrt n
        int midVal1 = 0; // to store the first seen mid value
        int midVal2 = 0; // to store the second seen mid value
        
        while(counter < (((m + n)/2) + 1)){ // stop at mid index
            midVal1 = midVal2;
            if(((i<m) && !(j<n))){
                midVal2 = nums1[i];
                counter++;
                i++;
            }else if((!(i<m) && (j<n))){
                midVal2 = nums2[j];
                counter++;
                j++;
            }else if(nums1[i] <= nums2[j]){
                midVal2 = nums1[i];
                counter++;
                i++;
            }else if(nums2[j] <= nums1[i]){
                midVal2 = nums2[j];
                counter++;
                j++;
            }else return 0; // no input on both arrays
        }

        if(((m+n) % 2) == 0){
            return (double) (midVal1 + midVal2) /2;
        }else return midVal2;
    }
}