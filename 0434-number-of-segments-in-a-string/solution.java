class Solution {
    public int countSegments(String s) {
        String res=s.trim();
        int n=res.length();
        int count=0;
        if(n==0){
            return 0;
        }
        for(int i=0;i<n-1;i++){
            if(res.charAt(i)==' ' && res.charAt(i+1)!=' '){
                count++;
            }
        }count++;
        return count;
    }
}
