class Solution {
    public long countCommas(long n) {
        long count = 0;
        long start = 1000;
        long commas = 1;

        while (start <= n) {
            long end = start * 1000 - 1;
            if (end < 0) {
                end = Long.MAX_VALUE;
            }
            long last = Math.min(n, end);
            count += (last - start + 1) * commas;
            start *= 1000;
            commas++;
        }
        return count;
    }
}
// class Solution {

//     public long countCommas(long n) {

//         long m = n;
//         long count = 0;

//         if (m < 1000) {
//             return 0;
//         }
//         else if (m < 1000000) {
//             return n - 999;
//         }
//         else if (m < 1000000000L) {
//             count = 999000L;
//             count += (n - 1000000L + 1) * 2L;
//             return count;
//         }
//         else {
//             count = 999000L;
//             count += 999000000L * 2L;
//             count += (n - 1000000000L + 1) * 3L;
//             return count;
//         }
//     }
// }