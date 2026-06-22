class Solution {

    public String encode(List<String> strs) {
        StringBuilder enStr = new StringBuilder();
        for (String str : strs){
            enStr.append(str.length()).append("#").append(str);
        }
        return enStr.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> deStr = new ArrayList<>();
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            deStr.add(str.substring(i,j));
            i = j;
        }
        return deStr;
    }
}
