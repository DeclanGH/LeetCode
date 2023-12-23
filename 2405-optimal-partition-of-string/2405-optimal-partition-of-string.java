class Solution {
    public int partitionString(String s) {

        int minimumPartition = 0;

        char[] characters = s.toCharArray();

        for (int i=0; i<characters.length;){

            boolean[] seen = new boolean[26];

            while(i<characters.length && !seen[characters[i] - 'a']){
                seen[characters[i] - 'a'] = true;
                i++;
            }

            minimumPartition += 1;
        }

        return minimumPartition;
    }
}