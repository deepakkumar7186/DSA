class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;

        if(num == 0){
            return 0;
        }
        if(num%2 == 1){
            steps++;
            num -= 1;
        }
        
        while(num != 0){
            num /= 2;
            steps++;
            if(num % 2 == 0){
                continue;
            }
            else{
                num -=1;
                steps++;
            }
            
        }
        return steps;
    }
}