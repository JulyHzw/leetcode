public class Q76_Minimum_Window_Substring {
}
/*
class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int kind = 0; // 存放元素类型，以及判断是否满足条件
        int minLeft = 0, minRight = 0, minLen = Integer.MAX_VALUE;
        // 将t所有元素放进map
        for(int i = 0; i < t.length(); i++){
            if(!map.containsKey(t.charAt(i)))
                kind++;
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        // 双指针遍历，当kind < 0表示满足条件
        for(int slow = 0, fast = 0; fast < s.length(); fast++){
            char curr = s.charAt(fast);
            if(!map.containsKey(curr)) continue;
            else{
                map.put(curr, map.get(curr) - 1);
                if(map.get(curr) == 0) kind--;
                if(kind == 0){//kind==0表示找到合适窗口
                    while(kind == 0 && slow < s.length()){//移动慢指针缩小窗口，找到最小窗口
                        char first = s.charAt(slow);
                        if(map.containsKey(first)){
                            map.put(first, map.get(first) + 1);
                            if(map.get(first) == 1) kind++;

                        }
                        slow++;
                    }
                    // 记录最小窗口的位置
                    if(minLen > fast - slow + 2){
                        minLen = fast - slow + 2;
                        minLeft = slow - 1;
                        minRight = fast + 1;
                    }
                }
            }
        }
        return s.substring(minLeft, minRight);
    }
}*/
