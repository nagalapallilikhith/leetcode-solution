class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        int m=haystack.length();
        for(int i=0;i<=m-n;i++){
            if(haystack.substring(0+i,n+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
