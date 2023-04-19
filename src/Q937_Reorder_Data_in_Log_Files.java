public class Q937_Reorder_Data_in_Log_Files {
}
/*
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, new Comparator<String>(){
            public int compare(String s1, String s2){
                int firstSpace1 = s1.indexOf(" ");
                int firstSpace2 = s2.indexOf(" ");

                String frontOfS1 = s1.substring(0, firstSpace1);
                String afterOfS1 = s1.substring(firstSpace1 + 1, s1.length());
                String frontOfS2 = s2.substring(0, firstSpace2);
                String afterOfS2 = s2.substring(firstSpace2 + 1, s2.length());

                if(isMath(afterOfS1) && isMath(afterOfS2)){
                    return 0;
                }else if(isMath(afterOfS1) && !isMath(afterOfS2)){
                    return 1;
                }else if(!isMath(afterOfS1) && isMath(afterOfS2)){
                    return -1;
                }else{
                    if(afterOfS1.compareTo(afterOfS2) == 0){
                        return frontOfS1.compareTo(frontOfS2);
                    }else {
                        return afterOfS1.compareTo(afterOfS2);
                    }
                }
            }
        });
        return logs;
    }

    public boolean isMath(String s){
        if(s.charAt(0) <= '9' && s.charAt(0) >= '0')
            return true;
        else
            return false;
    }
}*/
