class Solution {
    public int thirdMax(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min]){
                    min =j;
                }
            }int temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }
        int dist=1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                dist++;
            if(dist==3)return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}