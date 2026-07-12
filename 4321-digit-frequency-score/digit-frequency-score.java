class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        while(n!=0){
            int digi = n%10;
            sum+=digi;
            n/=10;
        }
            return sum;
    }
}