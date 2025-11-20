class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        ArrayList<Integer> set=new ArrayList<>();
        int n=x;
        while(n>0){
            set.add(n%10);
            n/=10;
        }
        int m=set.size();
        int left=0,right=m-1;
        int i=0;
        while(i<m/2){
            if(!set.get(i).equals(set.get(m-i-1))){
                return false;
            }i++;

        }return true;
    }
}
