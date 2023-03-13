# Leetcode Solutions Readme Template
## **Question**
***
* **No:** 238
* **Name:** Product of Array Except Self
* **Link:** https://leetcode.com/problems/product-of-array-except-self/

## **Difficulty**
***
- [ ] Easy
- [x] Medium
- [ ] Hard
## **Notes**
***
- The key point in the solution is using **prefix** and **postfix**
- These prefix and postfix will start from **1**
1. Prefix Side:
    - We need to do these steps for each element
    > Add prefix values into result array 1 by 1
    > Calculate new prefix value with multiplying with current element
2. Postfix Side:
    - Its almost similar steps like in the prefix
    > Add postfix values into result array with multiplying with current element in the result array
    > Calculate new postfix value with multiplying with current element
