class Solution {
    //{[]}"
    //"()[]{}"
    public boolean isValid(String s) {
        if(s.isEmpty()) return true;
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack();
        for(char c: s.toCharArray()){
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            } else if(c == ']' || c == '}' | c == ')'){
                if(stack.size()==0) return false;
                if(stack.peek() == '[' && c!=']') return false;
                if(stack.peek() == '(' && c!=')') return false;
                if(stack.peek() == '{' && c!='}') return false;
                
                stack.pop();
            }
        }
        return (stack.size()==0);
    }
}