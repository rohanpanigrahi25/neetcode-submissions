class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            while(!isAlphanumeric(s.charAt(l)) && l<r){
                l++;
            }
            while(!isAlphanumeric(s.charAt(r)) && r>l){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public boolean isAlphanumeric(char c){
        return ((c >= 'A' && c<='Z') || (c >= 'a' && c<='z') || (c >= '0' && c<='9'));
    }
}
