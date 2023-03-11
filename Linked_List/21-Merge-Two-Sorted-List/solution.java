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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tmpList1 = list1;
        ListNode tmpList2 = list2;
        ListNode resultList = new ListNode();
        ListNode runner = resultList;
        while (tmpList1 != null && tmpList2 != null){
            if(tmpList1.val <= tmpList2.val){
                runner.next = tmpList1;
                tmpList1 = tmpList1.next;
            }
            else{
                runner.next = tmpList2;
                tmpList2 = tmpList2.next;
            }
            runner = runner.next;
        }

        if(tmpList1 != null){
            runner.next = tmpList1;
        }
        else if(tmpList2 != null){
            runner.next = tmpList2;
        }
        return resultList.next;
    }
}