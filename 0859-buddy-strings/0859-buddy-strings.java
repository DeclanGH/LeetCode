class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        Set<Character> duplicate = new HashSet<>();
        int pos1 = -1;
        int pos2 = -1;
        int counter = 0;
        int repeat = 1;
        char[] sChar = s.toCharArray();
        char[] goalChar = goal.toCharArray();

        for(int i=0; i<sChar.length; i++){
            if(sChar[i] != goalChar[i]){
                if(counter == 0){
                    pos1 = i;
                    counter++;
                }else pos2 = i;
            }else if(!duplicate.add(sChar[i])){
                repeat++;
            }
        }

        if((pos1 == -1 && pos2 == -1) && repeat > 1){
            System.gc();
            return true;
        }

        if(pos2 == -1 || pos1 == -1){
            System.gc();
            return false;
        }
        
         char temp = sChar[pos1];
        sChar[pos1] = sChar[pos2];
        sChar[pos2] = temp;
        System.gc();
        return Arrays.equals(sChar,goalChar);
    }
}