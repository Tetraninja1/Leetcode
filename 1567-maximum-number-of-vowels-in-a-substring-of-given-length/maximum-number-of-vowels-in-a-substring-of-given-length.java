class Solution {
    public static boolean vow(char ch){
        return ch == 'a'||ch == 'e'||ch== 'i' || ch == 'o'||ch== 'u';
    }
    public int maxVowels(String s, int k) {
        int freq=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(vow(s.charAt(i))) freq++;
            if(i>=k){
                if(vow(s.charAt(i-k)))freq--;
                }
        max=Math.max(max,freq);
        }
     return max;   
    }
}