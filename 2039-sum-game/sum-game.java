class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int sumDiff = 0;
        int qDiff = 0;
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                if (num.charAt(i) == '?') {
                    qDiff++;
                } else {
                    sumDiff += num.charAt(i) - '0';
                }
            } else {
                if (num.charAt(i) == '?') {
                    qDiff--;
                } else {
                    sumDiff -= num.charAt(i) - '0';
                }
            }
        }
        return 2 * sumDiff + 9 * qDiff != 0;
    }
}