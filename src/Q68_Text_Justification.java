public class Q68_Text_Justification {
}
/*
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int len = words.length;
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0, stepLen = 0, stepNum = 0; i < len; i++){
            if(stepLen == 0){
                sb.append(words[i]);
                stepNum++;
                if(i == len - 1){
                    while(sb.length() < maxWidth){
                        sb.append(" ");
                    }
                    ans.add(sb.toString());
                }else{
                    stepLen += words[i].length();
                }
            }else if(stepLen + words[i].length() + 1 <= maxWidth){
                sb.append(" ");
                sb.append(words[i]);
                stepNum++;
                if(i == len - 1){
                    while(sb.length() < maxWidth){
                        sb.append(" ");
                    }
                    ans.add(sb.toString());
                }else{
                    stepLen += words[i].length() + 1;
                }
            }else if(stepLen + words[i].length() + 1 > maxWidth){
                if(stepNum == 1){
                    while(sb.length() < maxWidth){
                        sb.append(" ");
                    }
                }else{
                    int orgGap = maxWidth - sb.length();
                    int avgGap = orgGap / (stepNum - 1);
                    int moreGap = orgGap % (stepNum - 1);

                    for(int p = 0; p < sb.length(); p++){
                        if(sb.charAt(p) == ' '){
                            for(int k = 0; k < avgGap; k++){
                                sb.insert(p + 1, " ");
                            }
                            if(moreGap > 0){
                                sb.insert(p + 1, " ");
                                moreGap--;
                                p += 1;
                            }
                            p += avgGap;
                        }
                    }
                }
                ans.add(sb.toString());
                sb.delete(0, sb.length());
                stepLen = 0;
                stepNum = 0;
                i--;
            }
        }
        return ans;
    }
}*/
