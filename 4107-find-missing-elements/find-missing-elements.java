import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        if (nums == null || nums.length == 0) return missing;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) missing.add(i);
        }
        return missing;
    }
}
