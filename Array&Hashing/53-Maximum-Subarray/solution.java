class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;

        for(int i = 0; i < nums.length; i++){
            if(currSum < 0){
                currSum = 0;
            }
            currSum += nums[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }

        return maxSum;
    }
}