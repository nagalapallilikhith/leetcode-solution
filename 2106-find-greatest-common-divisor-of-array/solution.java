class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int min=nums[0] ,max=nums[0];
        for(int i:nums){
            if(i<min)
                min=i;
            if(i>max)
                max=i;
        }
        return gcd(min,max);
    }
}
