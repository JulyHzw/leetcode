public class Q20_Valid_Parentheses {
}
/*
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        int len = s.length();
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                if(!stk.isEmpty() && stk.peek() == '('){
                    stk.pop();
                }else{
                    return false;
                }
            }else if(s.charAt(i) == '}'){
                if(!stk.isEmpty() && stk.peek() == '{'){
                    stk.pop();
                }else{
                    return false;
                }
            }else if(s.charAt(i) == ']'){
                if(!stk.isEmpty() && stk.peek() == '['){
                    stk.pop();
                }else{
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}*/
