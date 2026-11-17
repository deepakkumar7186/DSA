class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for(int key : map.keySet()){
            int count = map.get(key);
            if(count == 2){
                ans ^= key;
            }
        }
        return ans;
    }
}