class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] cArr1 = s.toCharArray();
        char[] cArr2 = t.toCharArray();

        Map<Character, Integer> count = new HashMap<>();

        for (char c : cArr1){
            count.put(c, count.getOrDefault(c, 0)+1);
        }
        for(char c : cArr2) {
            count.put(c, count.getOrDefault(c, 0) - 1);
        }
        for(Map.Entry<Character, Integer> map : count.entrySet()){
            if(map.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}
