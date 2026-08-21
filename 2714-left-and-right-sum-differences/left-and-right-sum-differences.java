class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rightSum=0;
        for(int num :nums){
            rightSum+=num;
        }
        int leftSum=0;
        int []answer = new int [nums.length];
            for(int j=0;j<nums.length;j++){
                rightSum-=nums[j];
                answer[j] = Math.abs(leftSum - rightSum);
                leftSum+=nums[j];
            }
        return answer;
    }
}