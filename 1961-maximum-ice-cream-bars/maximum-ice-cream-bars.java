class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnn=0;
         for (int cost : costs) {
            if (cost > coins) break;
            cnn++;
            coins -= cost;
        }return cnn;
    }
}