class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] resultArray = new int[nums.length];
        int prefix = 1;
        int postfix = 1;
        for(int i = 0; i < nums.length; i++){
            resultArray[i] = prefix;
            prefix = prefix * nums[i];
        }
        for(int i = nums.length - 1; i >= 0; i--){
            resultArray[i] = resultArray[i] * postfix;
            postfix = postfix * nums[i];
        }

        return resultArray;
    }
}