import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0;
        char[] c = s.toCharArray();
        Map<Character,Integer> dic = new HashMap<>();
        for (int j=0;j<s.length();j++){
            if (dic.containsKey(c[j])&&dic.get(c[j])>=i){
                i = dic.get(c[j]) + 1;
            }else{
                max = max < (j-i+1)?j-i+1:max;
            }
            dic.put(c[j],j);
            /*System.out.println(dic);
            System.out.println(i);
            System.out.println(j);*/
        }
        return max;
    }
}
// @lc code=end

