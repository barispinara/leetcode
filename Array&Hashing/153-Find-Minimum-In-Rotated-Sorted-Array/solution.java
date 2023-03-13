class Solution {
    public int findMin(int[] nums) {
        int res = nums[0];
        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            // If given array is all sorted or splitted target array is all sorted.
            if(nums[l] <= nums[r]){
                res = Math.min(res , nums[l]);
                break;
            }
            int m = (l + r) / 2;
            res = Math.min(res , nums[m]);
            // If left side is sorted, then go right (find the rotate point)
            if(nums[m] >= nums[l]){
                l = m + 1;
            }
            // If right is sorted then go left (find the rotate point)
            else{
                r = m - 1;
            }
        }

        return res;
    }
}