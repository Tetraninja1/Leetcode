class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt =0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            n=nums[i];
            while(n>0){
                int sum =n%10;
                if(sum==digit)cnt++;
                n=n/10;
            }
        }return cnt;
    }
}