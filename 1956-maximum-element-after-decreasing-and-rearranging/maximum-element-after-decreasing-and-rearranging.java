import java.util.Arrays;
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
       Arrays.sort(arr);
       int temp = 1;
       for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > temp){
                temp += 1;
            }
        }
        return temp;
    }
}