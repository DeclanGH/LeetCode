class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while(i < j){
            boolean upperCase1 = s.charAt(i) >= 'A' && s.charAt(i) <= 'Z';
            boolean lowerCase1 = s.charAt(i) >= 'a' && s.charAt(i) <= 'z';
            boolean upperCase2 = s.charAt(j) >= 'A' && s.charAt(j) <= 'Z';
            boolean lowerCase2 = s.charAt(j) >= 'a' && s.charAt(j) <= 'z';
            boolean numeric1 = s.charAt(i) >= '0' && s.charAt(i) <= '9';
            boolean numeric2 = s.charAt(j) >= '0' && s.charAt(j) <= '9';
            if(!(upperCase1 || lowerCase1 || numeric1)){
                i++;
            }else if(!(upperCase2 || lowerCase2 || numeric2)){
                j--;
            }else if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}