class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++)if(nums[i]<0)nums[i]*=(-1);
        Arrays.sort(nums);
        int a = nums.length/2;
        for(int i=0;i<a;i++){
                sum=sum-(nums[i]*nums[i]);
        }for(int i=a;i<nums.length;i++){
                sum=sum+(nums[i]*nums[i]);
            }
        return sum;
    }
}