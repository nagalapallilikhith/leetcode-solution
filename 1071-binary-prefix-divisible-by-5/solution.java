class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> res=new ArrayList<>();
        int num=0;
        for(int i:nums){
            num=(num*2+i)%5;
            res.add(num==0);
        }
        return res;
    }
}
