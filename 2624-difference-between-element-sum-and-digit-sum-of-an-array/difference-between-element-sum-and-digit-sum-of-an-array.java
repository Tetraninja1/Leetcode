class Solution {
    public int differenceOfSum(int[] nums) {
        int k=0;
        int t=0;
        for(int i=0;i<nums.length;i++){
            k+=nums[i];
            int temp=nums[i];
            while(temp!=0){
                int x=temp%10;
                t+=x;
                temp/=10;
            }

        }return Math.abs(k-t);
    }
}