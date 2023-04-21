public class Q10_Regular_Expression_Matching {
}
/*
class Solution {
    public boolean isMatch(String s, String p) {
        s = " " + s; p = " " + p;
        int l1 = s.length(), l2 = p.length();
        boolean f[][] = new boolean[l1][l2];
        f[0][0] = true;
        for(int i = 0; i < l1; i++){
            for(int j = 1; j < l2; j++){
                if(j + 1 < l2 && p.charAt(j + 1) == '*') continue;
                if(p.charAt(j) != '*'){
                    f[i][j] = i > 0 && f[i-1][j-1] && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
                }else{
                    f[i][j] = f[i][j - 2] || (i > 0 && f[i-1][j] && (s.charAt(i) == p.charAt(j - 1) || p.charAt(j - 1) == '.'));
                }
            }
        }
        return f[l1 - 1][l2 - 1];
    }
}*/
