class Solution {
    public int minOperations(int[] nums) {
        // int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                return 1;
            }
        }return 0;
    }
}