class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[] = new int[128];
        int srt = 0;
        int end = 0;
        int ans = 0;
        while(end < s.length()){
            freq[s.charAt(end)]++;

            while(srt<=end && freq[s.charAt(end)]>=2){
                freq[s.charAt(srt)]--;
                srt++;
            }

            ans= Math.max(ans, end-srt+1);
            end++;
        }
        return ans;
    }
}