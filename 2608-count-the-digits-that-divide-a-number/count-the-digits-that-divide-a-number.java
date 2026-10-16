class Solution {
    public int countDigits(int num) {
        int val = num;
        int cnt=0;
        while(num!=0){
            int temp=num%10;
            if(val%temp==0)cnt++;
            num/=10;
        }return cnt;
    }
}