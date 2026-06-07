class Solution {
    public int countDigitOne(int n) {
        long place = 1;
        int count = 0;

        while (place <= n) {
            long high = n / (place * 10);
            long curr = (n / place) % 10;
            long low = n % place;

            if (curr == 0) {
                count += high * place;
            } 
            else if (curr == 1) {
                count += high * place + low + 1;
            } 
            else {
                count += (high + 1) * place;
            }

            place *= 10;
        }

        return count;
    }
}// class Solution {
//     public int countDigitOne(int n) {
//         int count = 0;
//         if(n <= 0){
//             return 0;
//         }
//         for(int i = n ; i >= 0 ; i--){
//             int temp = i;
//             while(temp != 0){
//                 if(temp%10 == 1){
//                     count++;
//                 }
//                 temp /= 10;
//             }
//         }
//         return count;
//     }
// }