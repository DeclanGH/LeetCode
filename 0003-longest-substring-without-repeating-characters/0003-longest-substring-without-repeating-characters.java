class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int start = 0;
        int end = 0;
        Set<Character> uniqueChars = new HashSet<>();
        
        while (end < n) {
            if (uniqueChars.contains(s.charAt(end))) {
                uniqueChars.remove(s.charAt(start));
                start++;
            } else {
                uniqueChars.add(s.charAt(end));
                maxLen = Math.max(maxLen, uniqueChars.size());
                end++;
            }
        }
        
        return maxLen;
    }
}
