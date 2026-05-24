class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {  
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n%2 == 0 && n%3 == 0 && n%5 == 0){
            while (n % 2 == 0) n /= 2;
            while (n % 3 == 0) n /= 3;
            while (n % 5 == 0) n /= 5;
            return n == 1;
        }
        else if(n%2 == 0 && n%3 == 0){
            while (n % 2 == 0) n /= 2;
            while (n % 3 == 0) n /= 3;
            return n == 1;
        }
        else if(n%3 == 0 && n%5 == 0){
            while (n % 3 == 0) n /= 3;
            while (n % 5 == 0) n /= 5;
            return n == 1;
        }
        else if(n%2 == 0 && n%5 == 0){
            while (n % 2 == 0) n /= 2;
            while (n % 5 == 0) n /= 5;
            return n == 1;
        }
        else if(n%2 == 0 || n%3 == 0 || n%5 == 0){
            while (n % 2 == 0) n /= 2;
            while (n % 3 == 0) n /= 3;
            while (n % 5 == 0) n /= 5;
            return n == 1;
        }
        else{
            return false;
        }
    }
}