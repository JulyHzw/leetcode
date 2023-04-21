public class Q3_Longest_Substring_Without_Repeating_Characters {
}
/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0, left = 0; right < len; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            ans = Math.max(right - left + 1, ans);
        }
        return ans;
    }
}*/
