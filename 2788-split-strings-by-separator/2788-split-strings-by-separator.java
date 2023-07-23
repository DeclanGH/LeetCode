class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for(int i=0; i<words.size(); i++){
            char[] c = words.get(i).toCharArray();
            for(int j=0; j<c.length; j++){
                String s = "";
                while(j<c.length && c[j] != separator){
                    s += c[j];
                    j++;
                }
                if(s.length()>0) res.add(s);
            }
        }
        return res;
    }
}