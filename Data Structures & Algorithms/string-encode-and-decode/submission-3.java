class Solution {

    public String encode(List<String> strs) {
        StringBuilder s =  new StringBuilder();
        for (String str : strs){
            s.append(str.length()).append("#").append(str);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> strs = new ArrayList<>();
        while (i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            strs.add(str.substring(i, i + len));
            i = i + len;
        }
        return strs;
    }
}
