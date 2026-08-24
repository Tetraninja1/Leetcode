class Solution {
    public double minimumAverage(int[] nums) {
        int avg=0;
        Arrays.sort(nums);
        int lo=0;
        int hi=nums.length-1;
        int i=0;
        int min= Integer.MAX_VALUE;
        while(lo<hi){
            avg = nums[lo]+nums[hi];
            if(avg<min){
                min =avg;
            }
            lo++;
            hi--;
        }return (double)min/2;
    }
}