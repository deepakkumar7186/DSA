class Solution {
    public boolean isHappy(int n) {
        boolean is_sad = false;
        boolean is_happy = true;
        int ran = 0;
        int sum = 0;
        if(n == 1) return is_happy;
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            sum = 0; 
            while(n != 0){
                ran = n % 10;
                sum += ran * ran;  
                n /= 10;
            }
            n = sum;
        }
        // while(n != 0){
        //     ran = n%10;
        //     sum = sum*10 + ran*ran;
        //     n /= 10;
        //     if(n == 0){
        //         n = sum;
        //     }
        //     else if(sum == 1){
        //         return is_happy;
        //     }
        // }
        if(sum == 1){
            return is_happy;
        }
        else{
            return is_sad;
        }

    }
}