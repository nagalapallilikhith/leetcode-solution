class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int small=nums[0];
        int large=nums[n-1];
        ArrayList<Integer> miss=new ArrayList<>();
        int i=0;
        for(int j=small;j<=large;j++){
            if(i<n && nums[i]==j){
                i++;
            }else{
                miss.add(j);
            }
        }
        return miss;
    }
}
