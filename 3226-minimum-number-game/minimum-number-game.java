class Solution {
    public int[] numberGame(int[] nums) {
        int [] arr = new int [nums.length];
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)arr[j]=nums[i+1];
            else{
                arr[j]=nums[i-1];
            }
            j++;
        }return arr;
    }
}