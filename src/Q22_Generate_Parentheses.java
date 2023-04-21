public class Q22_Generate_Parentheses {
}
/*
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void dfs(List<String> ans, StringBuilder step, int left, int right, int n){
        if(left > n || right > n) return;
        if(right > left) return;
        if(step.length() == 2 * n){
            ans.add(step.toString());
            return;
        }
        step.append("(");
        dfs(ans, step, left + 1, right, n);
        step.deleteCharAt(step.length() - 1);
        step.append(")");
        dfs(ans, step, left, right + 1, n);
        step.deleteCharAt(step.length() - 1);
    }
}*/
