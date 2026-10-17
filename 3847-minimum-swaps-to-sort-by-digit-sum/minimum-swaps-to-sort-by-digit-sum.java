class Solution {
    public int minSwaps(int[] nums) {
    int n = nums.length;
    int[][] arr = new int[n][2];


        for (int i = 0; i < n; i++) {
            int sum = 0;
            int num = nums[i];

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            arr[i][0] = nums[i];
            arr[i][1] = sum;
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int[] target = new int[n];

        for (int i = 0; i < n; i++) {
            target[i] = arr[i][0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != target[i]) {
                int j = map.get(target[i]);

                map.put(nums[i], j);
                map.put(target[i], i);

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                swaps++;
            }
        }

        return swaps;
    }
}

// class Solution {
//     public int minSwaps(int[] nums) {
       
//         for(int i = 0 ; i < nums.length ; i++){
//             int sum = 0;
//             while(nums[i] != 0){
//                 sum += nums[i]%10;
//                 nums[i] /= 10;
//             }
//             nums[i] = sum;
//         }
//         int itr = 0;
//         for(int i = 0 ; i < nums.length ; i++){
//             for(int j = i+1 ; j < nums.length ; j++){
//                 if(nums[i] > nums[j]){
//                     int c = nums[i];
//                     nums[i] = nums[j];
//                     nums[j] = c;
//                     itr++;
//                     break;
//                 }
//             }
//         }
//         return itr;
//     }
// }