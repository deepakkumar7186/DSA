class Solution {
    public int strStr(String haystack, String needle) {
        int j = 0; // match counter
        int k = 0; // mismatch counter

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            j = 0;
            k = 0;

            for (int m = 0; m < needle.length(); m++) {
                if (needle.charAt(m) == haystack.charAt(i + m)) {
                    j++;
                } else {
                    k++;
                    break;
                }
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}

// class Solution {
//     public int strStr(String haystack, String needle) {
//         int j = 0;
//         int k = 0;
//         for(int i = 0 ; i < needle.length() ; i++){
//             if(needle.charAt(i) == haystack.charAt(i)){
//                 j++;
//             }
//             else{
//                 k++;
//             }
//         }
//         // for(int i = 0 ; i < haystack.length() ; i++){
//         //     if(heystack.charAt(i) == needle.indexOf(charAt(i))){
//         //         return i;
//         //     }
//         // }
//         if(j == needle.length()){
//             return 0;
//         }
//         else{
//             return -1;
//         }
//     }
// }