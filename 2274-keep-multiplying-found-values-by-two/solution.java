class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean flag=true;
        while(flag){
            flag=false;
            for(int i:nums){
                if(i==original){
                    flag=true;
                    original*=2;
                    break;
                }
            }
        }
        return original;
    }
}
