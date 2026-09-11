class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int high=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>high)high= candies[i];
        }
        List<Boolean>arr= new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=high){
                arr.add(true);
            }
            else{
                 arr.add(false);
            }
        }return arr;
    }
}