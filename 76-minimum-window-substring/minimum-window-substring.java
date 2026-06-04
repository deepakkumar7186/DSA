class Solution {
    public String minWindow(String s, String t) {
        
        if (s.length() == 0 || t.length() == 0) return "";

        // Frequency map for characters in t
        java.util.Map<Character, Integer> need = new java.util.HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int required = need.size();  // distinct chars needed
        int formed = 0;              // distinct chars matched
        java.util.Map<Character, Integer> windowCounts = new java.util.HashMap<>();

        int left = 0, right = 0;
        int[] ans = {-1, 0, 0}; // length, left, right

        while (right < s.length()) {
            char c = s.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) && windowCounts.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            // Try shrinking from left
            while (left <= right && formed == required) {
                c = s.charAt(left);

                if (ans[0] == -1 || right - left + 1 < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }

                windowCounts.put(c, windowCounts.get(c) - 1);
                if (need.containsKey(c) && windowCounts.get(c) < need.get(c)) {
                    formed--;
                }
                left++;
            }
            right++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}