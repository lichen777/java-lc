https://leetcode.com/problems/add-two-numbers/description/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
        	return l1 == null ? l2 : l1;
        }
        
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode cur = result;
        
        while (l1 != null || l2 != null) {
        	int val1 = l1 == null ? 0 : l1.val;
        	int val2 = l2 == null ? 0 : l2.val;
        	int value = (val1 + val2 + carry) % 10;
        	cur.next = new ListNode(value);
        	carry = (val1 + val2 + carry) / 10;
        	l1 = l1 == null ? null : l1.next;
        	l2 = l2 == null ? null : l2.next;
        	cur = cur.next;
        }
        
        if(carry > 0) {
        	cur.next = new ListNode(1);
        }
        
        return result.next;
    }
}
