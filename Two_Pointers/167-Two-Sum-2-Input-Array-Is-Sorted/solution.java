class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0; //First Index
        int r = numbers.length - 1; //Last Index
        int[] resultArray = new int [2];
        while(l != r){
            int currSum = numbers[l] + numbers[r];
            if(currSum > target){
                r--;
            }
            else if(currSum < target){
                l++;
            }
            else{
                resultArray[0] = l+1;
                resultArray[1] = r+1;
                return resultArray;
            }
        }
        return null;
    }
}