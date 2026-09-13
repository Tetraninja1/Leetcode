class Solution {
    public boolean isSameAfterReversals(int num) {
        int n=num;
        int r=0;
        int s=0;
        while(n!=0){
            r=(r*10)+(n%10);
            n=n/10;
        }
        while(r!=0){
            s=(s*10)+(r%10);
            r=r/10;
        }return num==s;
    }
}