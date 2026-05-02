// class Solution {
//     public int mySqrt(int x) {
//         if(x == 0){
//             return 0;
//         }
//         else if(x < 0){
//             return -1;
//         }
//         else{
//             double num = Math.sqrt(x);
//             int data = (int) Math.floor(num);
//             return data;
//         }
//     }
// }

class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int ans = 0 ;
        if(x == 0){
            return 0;
        }
        else if(x < 0){
            return -1;
        }
        else{
            while (low <= high) {
            int mid = low + (high - low) / 2;

            if ( (long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        } 
        }
        return ans;
    }
}