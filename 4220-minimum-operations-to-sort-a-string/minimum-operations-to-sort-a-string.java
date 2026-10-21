class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;
        
        if (n == 2) return -1;
        
        char minChar = arr[0], maxChar = arr[0];
        for (char c : arr) {
            if (c < minChar) minChar = c;
            if (c > maxChar) maxChar = c;
        }
        
        if (arr[0] == minChar || arr[n - 1] == maxChar) {
            return 1;
        }
        
        boolean onlyMaxAtStart = (arr[0] == maxChar);
        for (int i = 1; i < n; i++) {
            if (arr[i] == maxChar) {
                onlyMaxAtStart = false;
                break;
            }
        }
        
        boolean onlyMinAtEnd = (arr[n - 1] == minChar);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == minChar) {
                onlyMinAtEnd = false;
                break;
            }
        }
        if (onlyMaxAtStart && onlyMinAtEnd) {
            return 3;
        }
        return 2;
    }
}