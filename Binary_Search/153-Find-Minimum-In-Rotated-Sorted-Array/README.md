# Leetcode Solutions Readme Template
## **Question**
***
* **No:** 153
* **Name:** Find Minimum in Rotated Sorted Array
* **Link:** https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

## **Difficulty**
***
- [ ] Easy
- [x] Medium
- [ ] Hard
## **Notes**
***
- This question can be hard to understand.
- We need to use **binary search** for the solution because algorithm must run in O(log n) time.
- The main trick is finding to rotation point in the given array.
- If the last index value is bigger than first index value then just return first index because it means array is not rotated and all sorted.
- Find middle point
> int m = (l + r) / 2
- If middle element value is bigger than left point then it means that left side is sorted, so we need to go **right**
- Otherwise, we need to go **left**