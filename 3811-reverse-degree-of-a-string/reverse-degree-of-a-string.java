class Solution {
    public int reverseDegree(String s) {
        int sum=0;
       for(int i=0;i<s.length();i++){
        char x=s.charAt(i);
        int rev = 26-(x-'a');
        int p=i+1;
        sum=(rev*p)+sum;
       }
       return sum;
    }
}