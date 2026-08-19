class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int cnt=0;
        int l=0;
        int r=nums.size()-1;
        while(l<r){
            if(nums.get(l)+nums.get(r)<target){
                cnt=cnt+(r-l);
                l++;
            }else{
                r--;
            }
        }
        return cnt;
    }
}