public class Q5_Longest_Palindromic_Substring {
}
/*class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int maxSubLen = 0;
        int left = -1, right = -1;
        for(int i = 0; i < len; i++){
            // 奇数情况
            int currLen;
            int currLeft = i - 1; int currRight = i + 1;
            while(currLeft >= 0 && currRight <= len - 1 && s.charAt(currLeft) == s.charAt(currRight)){
                currLeft--;
                currRight++;
            }
            currLen = currRight - currLeft - 1;
            if(currLen > maxSubLen){
                maxSubLen = currLen;
                left = currLeft;
                right = currRight;
            }
            // 偶数情况
            currLeft = i; currRight = i + 1;
            while(currLeft >= 0 && currRight <= len - 1 && s.charAt(currLeft) == s.charAt(currRight)){
                currLeft--;
                currRight++;
            }
            currLen = currRight - currLeft - 1;
            if(currLen > maxSubLen){
                maxSubLen = currLen;
                left = currLeft;
                right = currRight;
            }
        }
        return s.substring(left + 1, right);
    }
}*/
