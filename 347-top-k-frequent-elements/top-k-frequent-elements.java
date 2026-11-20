class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num: nums){
            mp.put(num, mp.getOrDefault(num, 0) +1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int key: mp.keySet()){
            int freq = mp.get(key);
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        int idx = 0;
        for(int freq = buckets.length - 1 ; freq >= 0 && idx < k ; freq--){
            if(buckets[freq] != null){
                for(int num: buckets[freq]){
                    arr[idx++] = num;
                    if(idx == k) break;
                }
            }
        }
        return arr;
    }
}