/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 *
 * https://leetcode-cn.com/problems/longest-palindromic-substring/description/
 *
 * algorithms
 * Medium (27.66%)
 * Likes:    1495
 * Dislikes: 0
 * Total Accepted:    145.2K
 * Total Submissions: 524.8K
 * Testcase Example:  '"babad"'
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 
 * 示例 1：
 * 
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 
 * 
 * 示例 2：
 * 
 * 输入: "cbbd"
 * 输出: "bb"
 * 
 * 
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int max_l = 0;
        String max = "";
        for (int i = 0;i<s.length();i++){
            int j;
            for (j = 0;i-j>=0&&i+j<s.length();j++){
                if (s.charAt(i-j)!=s.charAt(i+j)){
                    break;
                }
                if (j*2+1>max_l){
                    max = s.substring(i-j, i+j+1);
                    max_l = j*2+1;
                }
            }
        }
        for (int i=0;i<s.length()-1;i++){
            if (s.charAt(i)==s.charAt(i+1)){
                int j = 0;
                for (;i-j>=0&&i+1+j<s.length();j++){
                    if (s.charAt(i-j)!=s.charAt(i+j+1)){
                        break;
                    }
                    if (j*2+2>max_l){
                        max_l=j*2+2;
                        max = s.substring(i-j, i+j+2);
                    }
                }
            }
        }
        return max;
    }
}
// @lc code=end

