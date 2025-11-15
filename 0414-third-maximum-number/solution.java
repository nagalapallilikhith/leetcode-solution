class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> set=new ArrayList<>();
        Arrays.sort(nums);
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
            }
        }
        if(set.size()==1 || set.size()==2){
            return set.get(set.size()-1);
        }else{
            return set.get(set.size()-3);
        }
    }
}
