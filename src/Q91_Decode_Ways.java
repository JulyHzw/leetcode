public class Q91_Decode_Ways {
}
/*
class Solution {

    public int numDecodings(String s) {
        if(s.charAt(0) == '0') return 0;
        int len = s.length();
        int[] f = new int[len];
        f[0] = 1;
        for(int i = 1; i < len; i++){
            if(i + 1 < len && s.charAt(i + 1) == '0') continue;
            if(s.charAt(i) == '0'){
                if(s.charAt(i - 1) != '1' && s.charAt(i - 1) != '2') return 0;
                f[i] = i - 2 >= 0 ? f[i - 2] : 1;
            }else if(s.charAt(i) > '6'){
                if(s.charAt(i - 1) == '1'){
                    f[i] = f[i - 1] + (i - 2 >= 0 ? f[i - 2] : 1);
                }else{
                    f[i] = f[i - 1];
                }
            }else if(s.charAt(i) <= '6'){
                if(s.charAt(i - 1) != '1' && s.charAt(i - 1) != '2'){
                    f[i] = f[i - 1];
                }else{
                    f[i] = f[i - 1] + (i - 2 >= 0 ? f[i - 2] : 1);
                }
            }
        }
        return f[len - 1];
    }
}*/
