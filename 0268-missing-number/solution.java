import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        // int max=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]>max){
        //         max=nums[i];
        //     }
        // }
        Arrays.sort(nums);
        if(nums[nums.length-1]!=nums.length){
            return nums.length;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return 0;
    }
}
