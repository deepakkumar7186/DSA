// // class Solution {
// //     public boolean judgeSquareSum(int c) {
        
// //         for(int i = 0 ; i*i <= c ; i++){   
// //             int j = (int)Math.sqrt(c - i*i); 
// //             if(j*j + i*i == c){           
// //                 return true;
// //             }
// //         }
// //         return false;  
// //     }
// // }
// class Solution {
//     public boolean judgeSquareSum(int c) {
//         for(int i = 0; i*i <= c; i++){
//             int j = (int)Math.sqrt(c - i*i); 
//             if(j*j + i*i == c){
//                 return true;
//             }
//         }
//         return false;  
//     }
// }
class Solution {
    public boolean judgeSquareSum(int c) {
        for (long i = 0; i * i <= c; i++) {
            long remaining = c - i * i;
            long j = (long) Math.sqrt(remaining);

            if (j * j == remaining) {
                return true;
            }
        }
        return false;
    }
}