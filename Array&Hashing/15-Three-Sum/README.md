# Leetcode Solutions Readme Template
## **Question**
***
* **No:** 15
* **Name:** 3Sum (Three Sum)
* **Link:** https://leetcode.com/problems/3sum/description/

## **Difficulty**
***
- [ ] Easy
- [x] Medium
- [ ] Hard
## **Notes**
***
- This question has a similar solution with **167. Two-Sum-2-Input-Array-Is-Sorted**
- First of all, we need to sort the array
> Arrays.sort(given array)
- One of important part is solution must not contain duplicate results that's why we also need to check pointer value when shifting.
- There are 3 pointer
> 1st pointer is i (comes from for loop and starts from 0 to array length)
> 2nd pointer is l (starts from i + 1)
> 3rd pointer is r (starts from (array length - 1))
- Start to sum all these 3 pointers value and if result is bigger then 0 then go left. Otherwise go right.
- If we found the result (sum is equals to 0) then add it to the result arraylist
- **Note:** After adding the result into arraylist, we also need to check that next value of l pointer is not the same (check the last while loop in the solution)