class Solution {
    public boolean isAnagram(String s, String t) {
        // Automatic cases
        if(s.length() != t.length()){return false;}
        if(s.equals(t)){return true;}

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        s = new String(sChar);
        t = new String(tChar);

        return s.equals(t);
    }
}