class Solution {
    public boolean isHappy(int n) {
        while(n>9){
            int sum=0;
            int dig=1;
            while(n>0){
                dig=n%10;
                sum+=dig*dig;
                n/=10;
            }
            n=sum;
        }
        if(n==1 || n==7){
            return true;
        }else{
            return false;
        }
    }
}
