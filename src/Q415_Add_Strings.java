public class Q415_Add_Strings {
}
/*
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        int thirdNum = 0;
        while(index1 >= 0 || index2 >= 0 || thirdNum == 1){
            int x = index1 >= 0 ? num1.charAt(index1--) - '0' : 0;
            int y = index2 >= 0 ? num2.charAt(index2--) - '0' : 0;
            int curr = x + y + thirdNum;
            ans.append(curr % 10);
            thirdNum = curr / 10;
        }
        return ans.reverse().toString();
    }
}*/
