// https://leetcode.com/problems/merge-k-sorted-lists/description/

/* Note: there is a hidden time and space cost of slicing and allocating new arrays.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if(len == 0){
            return null;
        }
        if(len == 1){
            return lists[0];
        }
        int mid = len / 2;
        ListNode[] left = Arrays.copyOfRange(lists, 0, mid);
        ListNode[] right = Arrays.copyOfRange(lists, mid, len);
        return mergeTwoLists(mergeKLists(left), mergeKLists(right));
    }
    private ListNode mergeTwoLists(ListNode left, ListNode right) {
        if(left == null || right == null) {
            return left != null ? left : right;
        }
        if(left.val < right.val) {
            left.next = mergeTwoLists(left.next, right);
            return left;
        }else {
            right.next = mergeTwoLists(left, right.next);
            return right;
        }
    }
}
