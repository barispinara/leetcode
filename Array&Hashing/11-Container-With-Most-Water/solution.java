class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int l = 0;
        int r = height.length - 1;
        while(l < r){
            int currWidth = r - l;
            int currHeight = Math.min(height[l] , height[r]);
            int currCapacity = currWidth * currHeight;
            if(currCapacity > maxWater){
                maxWater = currCapacity;
            }
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
            
        }

        return maxWater;
    }
}