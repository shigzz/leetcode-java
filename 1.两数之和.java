import java.util.HashMap;
import java.util.Map;


/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> dic = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (dic.containsKey(target-nums[i])){
                return new int[]{dic.get(target-nums[i]),i};
            }
            dic.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
// @lc code=end

