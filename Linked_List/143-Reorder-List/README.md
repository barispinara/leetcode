# Leetcode Solutions Readme Template
## **Question**
***
* **No:** 143
* **Name:** Reorder List
* **Link:** https://leetcode.com/problems/reorder-list/

## **Difficulty**
***
- [ ] Easy
- [X] Medium
- [ ] Hard
## **Notes**
***
1. Find the middle of the linked list
> 1 > 2 > 3 > 4 > 5 (middle node is 3)
2. Then reverse the second half of the Linked List (i.e 4 > 5)
> Second half of the linkedlist : 5 > 4
3. Merge both list in ordered way like one element of 1st half linkedlist (i.e 1 > 2 > 3) and one element of second half lift (i.e 5 > 4)
> First list : 1 > 2 > 3
> Second List : 5 > 4
> Result : 1 > 5 > 2 > 4 > 3



