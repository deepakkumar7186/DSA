class Solution {
    public int addDigits(int num) {
        int sum = 0;
        int ran = 0;
        while(num >= 10){
            sum = 0;
            while(num > 0){
                // ran = num%10;
                sum += num % 10;
                num = num/10;
            }
            num = sum;
        }
        return num;
        // while(num != 0){
        //     ran = num%10;
        //     sum = sum*10 + ran;
        //     num = num/10;
        //     if(num == 0){
        //         //num = sum;
        //         //sum = 0;
        //         if(sum >= -9 && sum <= 9){
        //             num = sum;
        //         }
        //         else{
        //             sum = 0;
        //         }
                
        //     }
        // }
        //return num;
    }
}