class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-->0){
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(nums[j]>nums[i]){
                    j=i;
                }
            }
            nums[j]*=multiplier;
        }return nums;
    }
}