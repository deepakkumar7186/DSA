// class Solution {
//     public int myAtoi(String s) {
//        int num;
//        num = int(s); 
//        int rev = 0;

//         while (num != 0) {
//             int digit = num % 10;
//             rev = rev * 10 + digit; 
//             num /= 10;              
//         }

//        for(int i = rev ; i > 0 ; i--){
//             int digit = rev % 10;   
//             if(digit == (int)digit){

//             }
//             else{
//                 break;
//             }
//             rev /= 10;              
//        }
//        return rev;
//     }
// }
class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // remove leading/trailing spaces
        if (s.isEmpty()) return 0;

        int sign = 1, i = 0, n = s.length();
        long num = 0; // use long to handle overflow

        // check sign
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (sign * num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return (int)(sign * num);
    }
}
