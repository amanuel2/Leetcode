class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()) return true;
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack();
        for(char c: s.toCharArray()){
            if(c == '[' || c == '{' || c == '(') stack.push(c);
            else{
                if(stack.size()>0){
                    Character pop = stack.pop();
                    if(c == ']' && !pop.equals('[')) return false;
                    else{
                        if(c == '}' && (!stack.contains('{')&&!pop.equals('{'))) return false;
                        if(c == ')' && (!stack.contains('(')&&!pop.equals('('))) return false;
                    }
                } else return false;
            }
        }
        return (stack.size()==0);
    }
}