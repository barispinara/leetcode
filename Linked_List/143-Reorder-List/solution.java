/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        
        //Find median node
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //ListNode slow is our median node
        ListNode secondList = reverseList(slow.next);
        slow.next = null;
        ListNode curr = head;
        ListNode dummy = secondList;

        while(dummy != null){
            ListNode temp = curr.next;
            curr.next = dummy;
            ListNode temp2 = dummy.next;
            dummy.next = temp;
            curr = temp;
            dummy = temp2;
        }
    }
    
    public ListNode reverseList(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}