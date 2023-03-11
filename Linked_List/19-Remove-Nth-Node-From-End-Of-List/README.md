# Leetcode Solutions Readme Template
## **Question**
***
* **No:** 19
* **Name:** Remove Nth Node From End of List
* **Link:** https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

## **Difficulty**
***
- [ ] Easy
- [x] Medium
- [ ] Hard
## **Notes**
***
- First of all, find the length of Linked List because given index value counts from the end (It is 1-based index)
- If given linkedlist has 1 element, then just return empty list;
- Calculate new target index which starts from beginning (targetIndex)
- Check special condition that for removing head node from the linked list (check the if statement)
- Traverse elements in the linkedlist and try to find n'th element.
- Check that this n'th element is the last element in the linked list or not
