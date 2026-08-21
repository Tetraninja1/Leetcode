class Solution {
    public String capitalizeTitle(String title) {
        String arr[]= title.split(" ");
        String result = "";
        for(String word :arr){
            if(word.length()<=2){
                for(int i=0;i<word.length();i++){
                result+=Character.toLowerCase(word.charAt(i));
            }
            }else{
                result+=Character.toUpperCase(word.charAt(0));
                for(int i=1;i<word.length();i++){
                    result+=Character.toLowerCase(word.charAt(i));
                }
            }
            result+=" ";
        }   
            return result.trim();
    }
}