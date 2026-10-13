class Solution {
    public boolean checkGoodInteger(int n) {
        int sum =0;
        int sqsum=0;
        while(n!=0){
            int temp = n %10;
            sum+=temp;
            sqsum+=(temp*temp);
            n=n/10;
        }return (sqsum-sum>=50);
    }
}