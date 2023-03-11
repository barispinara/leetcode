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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Finding length of given linked list
        int size = findSizeOfLinkedList(head);
        //Special case if case
        if(size == 1){
            head = null;
            return head;
        }
        //Finding target index value from beginning
        int targetIndex = size - n;

        //If we need to remove head node from the linkedlist
        if(targetIndex == 0){
            head = head.next;
            return head;
        }
        int index = 1;
        ListNode runner = head;
        while(targetIndex > index){
            runner = runner.next;
            index++;
        }
        //Check that n'th element is the ast element in the linked list or not.
        if(runner.next.next != null){
            runner.next = runner.next.next;
        }
        else{
            runner.next = null;
        }
        
        return head;
    }

    public Integer findSizeOfLinkedList(ListNode head){
        ListNode runner = head;
        int count = 0;
        while(runner != null){
            runner = runner.next;
            count++;
        }
        return count;
    }
}