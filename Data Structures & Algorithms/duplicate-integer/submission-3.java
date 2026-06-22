class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();

        for (int num : nums) {
            mySet.add(num);
        }

        if(mySet.size() == nums.length){
            return false;
        }

        return true;
    }
}