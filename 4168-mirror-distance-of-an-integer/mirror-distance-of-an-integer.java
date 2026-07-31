class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int u=n;
        while(u!=0){
            int v = u%10;
            rev = rev*10 + v;
            u=u/10;
        }
        n=n-rev;
        return Math.abs(n);
    }
}