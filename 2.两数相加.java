/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry =0;
        while (l1!=null||l2!=null){
           int x = l1!=null?l1.val:0;
           int y = l2!=null?l2.val:0;
           int sum = x + y + carry;
           carry = sum/10;
           curr.next = new ListNode(sum%10);
           curr = curr.next;
           l1 = l1!=null? l1.next:null;
           l2 = l2!=null? l2.next:null;
        }
        if (carry >0){
            curr.next = new ListNode(carry);
        }
        return head.next;
    }
}
// @lc code=end

