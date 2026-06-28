class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();

        for(int num : nums){
            count.put(num, count.getOrDefault(num,0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for(int i=0; i<bucket.length; i++){
            bucket[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int pos = 0;

        for(int i = bucket.length-1; i>=0; i--){
            for(int ele : bucket[i]){
                if(pos==k){
                    return res;
                }
                res[pos++] = ele;
            }
        }
        return res;
    }
}





