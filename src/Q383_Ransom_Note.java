public class Q383_Ransom_Note {
}
/*
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) return false;
        int[] alphabetsCounter = new int[26];
        for(char c : magazine.toCharArray())
            alphabetsCounter[c - 'a']++;
        for(char c : ransomNote.toCharArray()){
            if(alphabetsCounter[c - 'a'] == 0) return false;
            else alphabetsCounter[c - 'a']--;
        }
        return true;
    }
}
*/
