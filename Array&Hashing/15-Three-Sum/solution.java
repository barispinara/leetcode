class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Basic sorting the array
        //Sorting: Time complexity O(n logn)
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < nums.length; i++){
            //For passing duplicates
            if( i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while ( l < r){
                int threeSum = nums[i] + nums[l] + nums[r];
                //Going right
                if(threeSum < 0){
                    l++;
                }
                //Going left
                else if(threeSum > 0){
                    r--;
                }
                else{
                    List<Integer> outputList = new ArrayList<Integer>();
                    outputList.add(nums[i]);
                    outputList.add(nums[l]);
                    outputList.add(nums[r]);

                    resultList.add(outputList);
                    //After finding one output then we need to shift our l pointer but
                    //we also need to check that there is no duplicate in next element.
                    l++;
                    while(nums[l] == nums[l-1] && l < r){
                        l++;
                    }
                }
            }
        }
        return resultList;
    }
}