// class Solution {
//     public int divide(int dividend, int divisor) {
//         int answer;
//         answer = dividend/divisor;
//         if(dividend == -1 && divisor == -1){
//             answer = Math.abs(answer);
//             return answer;
//         }

//         if(dividend < 0 && divisor < 0){
//             answer = Math.abs(answer)-1;
//         }
        
//         return answer;
//     }
// }
class Solution {
    public int divide(int dividend, int divisor) {
        
        // Edge case (overflow)
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Convert to long to avoid overflow
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        
        long result = a / b;
        
        // Handle sign
        if ((dividend < 0) ^ (divisor < 0)) {
            result = -result;
        }
        
        return (int) result;
    }
}
