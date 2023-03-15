# Leetcode Solutions Readme Template
## **Question**
***
* **No:** 49
* **Name:** Group Anagrams
* **Link:** https://leetcode.com/problems/group-anagrams/description/

## **Difficulty**
***
- [ ] Easy
- [x] Medium
- [ ] Hard
## **Notes**
***
* This question can be hard to understand
* For finding group anagram we need to declare char array size of 26 (26 is number of all alphabets.)
* Start to take each char in current string and subtract it from char 'a' and count it
> For example: (int)'c' - (int)'a' = 2 then countArray[2] += 1
* Then save this filled charArray in to the HashMap
* After traversing all string in given array, then return HashMap values.