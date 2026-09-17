class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] arr=new int[2];
        boolean[] a = new boolean[nums.length];
        int t=0;
        for(int i=0;i<nums.length;i++){
           if(a[nums[i]]==true)arr[t++]=nums[i];
           else a[nums[i]]=true;
        }return arr;
    }
}