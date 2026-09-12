class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int sum=0;
            while(n!=0){
                sum = sum + (n%10);
                n=n/10;
            }nums[i]=sum;
        }
        int n=nums[0];
        for(int i=0;i<nums.length;i++){
            if(n>nums[i]){
                n= nums[i];
            }
        }return n;
    }
}