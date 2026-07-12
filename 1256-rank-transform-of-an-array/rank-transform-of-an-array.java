import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        int[] newArr = arr.clone();
        Arrays.sort(newArr);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int j = 0; j < newArr.length; j++) {
            if (!rankMap.containsKey(newArr[j])) {
                rankMap.put(newArr[j], rank);
                rank++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            temp[i] = rankMap.get(arr[i]);
        }
        return temp;
    }
}
