public class Q1249_Minimum_Remove_to_Make_Valid_Parentheses {
}
/*
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        int len = s.length();
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '('){
                stk1.push('(');
                stk2.push(i);
            }else if(s.charAt(i) == ')'){
                if(!stk1.isEmpty() && stk1.peek() == '('){
                    stk1.pop();
                    stk2.pop();
                }else{
                    stk1.push(')');
                    stk2.push(i);
                }
            }
        }

        char[] array = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        while(!stk2.isEmpty()){
            array[stk2.pop()] = '#';
        }
        for(int i = 0; i < len; i++){
            if(array[i] != '#') ans.append(array[i]);
        }
        return ans.toString();
    }
}*/
