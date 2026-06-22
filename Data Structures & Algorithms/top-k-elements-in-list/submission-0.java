class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count= new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int num : nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }

        int res[] = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i > 0 && index<k; i--){
            for (int num : bucket[i]){
                res[index++] = num;
                if (index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
