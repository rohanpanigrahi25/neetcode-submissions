class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodeStr = new StringBuilder();
        for(String str : strs){
            encodeStr.append(str.length()).append("#").append(str);
        }
        return encodeStr.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i=0;
        while (i<str.length()){
            int j=i;
            while(str.charAt(j) != '#') j++;
            int length = Integer.valueOf(str.substring(i,j));
            i = j+1+length;
            res.add(str.substring(j+1, i));
        }
        return res;
    }
}
