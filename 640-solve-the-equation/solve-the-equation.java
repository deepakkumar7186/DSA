class Solution {
    public String solveEquation(String equation) {
        String[] parts = equation.split("=");
        int[] left = evaluate(parts[0]);
        int[] right = evaluate(parts[1]);

        int coeff = left[0] - right[0];
        int constVal = right[1] - left[1];

        if (coeff == 0) {
            if (constVal == 0) return "Infinite solutions";
            else return "No solution";
        }

        return "x=" + (constVal / coeff);
    }

    private int[] evaluate(String expr) {
        int coeff = 0, constVal = 0;
        int sign = 1;
        int i = 0;
        while (i < expr.length()) {
            if (expr.charAt(i) == '+') {
                sign = 1;
                i++;
            } else if (expr.charAt(i) == '-') {
                sign = -1;
                i++;
            } else {
                int num = 0;
                boolean isNumber = false;
                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                    num = num * 10 + (expr.charAt(i) - '0');
                    i++;
                    isNumber = true;
                }
                if (i < expr.length() && expr.charAt(i) == 'x') {
                    if (!isNumber) num = 1;
                    coeff += sign * num;
                    i++;
                } else {
                    constVal += sign * num;
                }
            }
        }
        return new int[]{coeff, constVal};
    }
}
