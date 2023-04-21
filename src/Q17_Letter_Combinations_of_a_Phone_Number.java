public class Q17_Letter_Combinations_of_a_Phone_Number {
}
/*
class Solution {
    public char[][] letters = {
            {'3', 'a', 'b', 'c'}, {'3', 'd', 'e', 'f'},
            {'3', 'g', 'h', 'i'}, {'3', 'j', 'k', 'l'}, {'3', 'm', 'n', 'o'},
            {'4', 'p', 'q', 'r', 's'}, {'3', 't', 'u', 'v'}, {'4', 'w', 'x', 'y', 'z'}
    };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        dfs(ans, new StringBuilder(), 0, digits);
        return ans;
    }

    public void dfs(List<String> ans, StringBuilder sb, int step, String digits){
        if(sb.length() == digits.length()){
            ans.add(sb.toString());
            return;
        }
        int curr = digits.charAt(step) - '2';
        for(int i = 1; i <= letters[curr][0] - '0'; i++){
            sb.append(letters[curr][i]);
            dfs(ans, sb, step + 1, digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}*/
