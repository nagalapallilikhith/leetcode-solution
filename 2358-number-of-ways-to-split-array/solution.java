class Solution {
    public int waysToSplitArray(int[] nums) {
        long total=0;
        int count=0;
        long left=0;
        for(int i:nums){
            total+=i;
        }
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            long right=total-left;
            if(left>=right){
                count++;
            }
        }
        return count;
    }
}
