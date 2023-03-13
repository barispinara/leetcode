# Leetcode Solutions Readme Template
## **Question**
***
* **No:** 167
* **Name:** Two Sum 2 - Input Array is Sorted
* **Link:** https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

## **Difficulty**
***
- [ ] Easy
- [x] Medium
- [ ] Hard
## **Notes**
***
- We need to use 2 pointer, these 2 pointers will be
> 1st point is for left side (initial **first index**)
> 2st point is for right side (inital **last index**)
- Start to sum these 2 point index values
- The given array is already sorted that's why if current sum is bigger than target then we need to check left side (increase l pointer by 1)
- If current sum is smaller than target then we need to check right side (increase r pointer by 1)