import java.util.*;

class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length, mx = Integer.MIN_VALUE;
        int[] prefixGcd = new int[n];
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            prefixGcd[i] = gcd(mx, nums[i]);
        }
        Arrays.sort(prefixGcd);
        long sum = 0;
        int l = 0, r = n - 1;
        while (l < r) {
            sum += gcd(prefixGcd[l], prefixGcd[r]);
            l++; r--;
        }
        return sum;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
// import java.util.Arrays;
// class Solution {
//     public long gcdSum(int[] nums) {
//         int mx = Integer.MIN_VALUE;
//         int n = nums.length;
//         Arrays.sort(nums);
//         if (n > 0 && n < 3) {
//             if (n == 1 || (n == 2 && nums[0] == nums[1])) {
//                 return nums[0];
//             }
//         } else if (n == 4) {
//             return nums[0] + nums[1];
//         }
//         return nums[0];
//     }
// }