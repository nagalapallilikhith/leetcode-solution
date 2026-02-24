class Solution {
    public int maxProduct(int[] nums) {
        int mxp=nums[0],mnp=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            if(nums[i]<0){
                int t=mnp;
                mnp=mxp;
                mxp=t;
            }
            mxp=Math.max(num,mxp*nums[i]);
            mnp=Math.min(num,mnp*nums[i]);
            res=Math.max(res,mxp);
        }return res;
    }
}
