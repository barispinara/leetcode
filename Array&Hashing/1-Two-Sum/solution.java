class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> recordList = new HashMap<>();
        int[] returnResult = new int[2];
        for(int i = 0; i < nums.length; i++){
            int currElement = nums[i];
            int currResult = target - currElement;
            if(!recordList.containsKey(currElement)){
                recordList.put(currResult , i);
            }
            else{
                returnResult[0] = i;
                returnResult[1] = recordList.get(currElement);
                return returnResult;
            }
        }

        return null;
    }
}