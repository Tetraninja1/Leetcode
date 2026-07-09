class Solution {
    public String convertToBase7(int num) {
        String s= "";
        int org = num;
        String rev = "";
        num = Math.abs(num);
        if(num ==0)return "0";
        while (num > 0){
            s = s + num % 7;
            num = num/7;
        }if(org<num)s += "-";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        return rev;
    }
}