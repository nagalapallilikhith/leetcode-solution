class Solution {
    public int maxSubArray(int[] nums) {
        int mx=nums[0],s=0;
        for(int num:nums){
            s=s+num;
            mx=Math.max(mx,s);
            if(s<0){
                s=0;
            }
        }return mx;
    }
}
