// class Solution {
//     public int clumsy(int n) {
//         int counter = 1;
//         int ans = 1;
//         for(int i = n ; i >= 1 ; i--){
//             if(counter > 4){
//                 counter = 1;
//             }
//             switch(counter){
//                 case 1: 
//                     ans *= i;
//                     break;
//                 case 2: 
//                     ans /= i;
//                     break;
//                 case 3: 
//                     ans += i;
//                     break;
//                 case 4:
//                     ans -= i;
//                     break;

//             }
//             counter++;
//         }
//         return ans;
//     }
// }
class Solution {
    public int clumsy(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 6;
        if (n == 4) return 7;
        
        if (n % 4 == 1) return n + 2;
        if (n % 4 == 2) return n + 2;
        if (n % 4 == 3) return n - 1;
        return n + 1;
    }
}