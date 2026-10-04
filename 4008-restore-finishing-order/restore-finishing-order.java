class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        Set<Integer> set = new HashSet<>();

        for (int id : friends) set.add(id);
        
        int i = 0;
        for (int id : order) if (set.contains(id)) ans[i++] = id;

        return ans; 
    }
}