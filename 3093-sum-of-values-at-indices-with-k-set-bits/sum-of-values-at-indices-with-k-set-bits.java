class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int x=0;
        for(int i=0;i<nums.size();i++){
            int temp= i;
            int count =0;
            while(temp!=0){
                if(temp%2==1)count++;
                temp=temp/2;
            }
            if(count==k)x=nums.get(i)+x;
        }return x;
    }
}