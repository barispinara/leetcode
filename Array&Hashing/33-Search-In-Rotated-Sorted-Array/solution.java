class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while( l <= r){
            int m = (l + r) / 2;
            if(nums[m] == target){
                return m;
            }
            //If current l to m is sorted
            if(nums[m] >= nums[l]){
                //check that target is in the left side or not.

                //If it is not in l side then look right
                if(target > nums[m] || target < nums[l]){
                    l = m + 1;
                }
                //Otherwise check left.
                else{
                    r = m - 1;
                }
            }
            //If current m to r is sorted
            else{
                //check that target is in the right side or not.

                //If it is not in r side then look left
                if(target < nums[m] || target > nums[r]){
                    r = m - 1;
                }
                //Otherwise check right.
                else{
                    l = m + 1;
                }
            }
            
        }

        return -1;
    }
}