public class Q49_Group_Anagrams {
}
/*
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        String[] newStrs = new String[len];
        Map<String, Integer> map = new HashMap<>();
        int index = 0;
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < len; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            newStrs[i] = Arrays.toString(ch);
        }
        for(int i = 0; i < len; i++){
            if(!map.containsKey(newStrs[i])){
                map.put(newStrs[i], index++);
                List<String> step = new ArrayList<>();
                step.add(strs[i]);
                ans.add(step);
            }else{
                int key = map.get(newStrs[i]);
                ans.get(key).add(strs[i]);
            }
        }
        return ans;
    }
}*/

// 遍历HashMap
/*class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < len; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String newStr = Arrays.toString(ch);
            if(map.containsKey(newStr))
                map.get(newStr).add(strs[i]);
            else{
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                map.put(newStr, newList);
            }
        }
        for(Map.Entry entry : map.entrySet()){
            ans.add((List<String>) entry.getValue());
        }
        return ans;
    }
}*/
