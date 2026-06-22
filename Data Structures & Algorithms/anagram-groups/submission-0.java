class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs){
            char[] sSorted = s.toCharArray();
            Arrays.sort(sSorted);
            String sortedString = new String(sSorted);
            res.putIfAbsent(sortedString, new ArrayList<>());
            res.get(sortedString).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
