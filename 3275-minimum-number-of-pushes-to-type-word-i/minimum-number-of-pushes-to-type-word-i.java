class Solution {
    public int minimumPushes(String word) {
        java.util.Set<Character> set = new java.util.HashSet<>();
        for (char c : word.toCharArray()) {
            set.add(c);
        }

        int unique = set.size();
        int pushes = 0;
        int cost = 1;
        while (unique > 0) {
            int assign = Math.min(8, unique);
            pushes += assign * cost;
            unique -= assign;
            cost++;
        }   
        return pushes;
    }
}