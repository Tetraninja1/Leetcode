class Solution {
    public int maxArea(int[] height) {
        int lo =0;
        int hi =height.length-1;
        int maxarea=0;
        while(lo<hi){
            int width = hi-lo;
            int container= Math.min(height[lo],height[hi]);
            int area = width*container;
            maxarea= Math.max(maxarea,area);
            if(height[lo]<height[hi]){
                lo++;
            }else{
                hi--;
            }
        }return maxarea;
    }
}