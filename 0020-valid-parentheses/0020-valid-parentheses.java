class Solution {
    public boolean isValid(String s) {
        // Automatic false cases
        boolean odd = s.length()%2 != 0;
        char first = s.charAt(0);
        char last = s.charAt((s.length()) - 1);
        if(odd || first == ')'|| first == '}'|| first == ']'|| last == '('|| last == '{'|| last == '['){
            return false;
            }

        Stack<Character> charStack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                charStack.push(c);
            }else if(c == ')'  && !charStack.empty() && charStack.peek() == '('){
                charStack.pop();
            }else if(c == '}'  && !charStack.empty() && charStack.peek() == '{'){
                charStack.pop();
            }else if(c == ']'  && !charStack.empty() && charStack.peek() == '['){
                charStack.pop();
            }else return false;
        }
        return charStack.empty();
    }
}