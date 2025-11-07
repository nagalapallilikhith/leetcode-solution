class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> res=new ArrayList<>();
        int k=1;
        int dup=-1;
        for(int i:nums){
            if(i==k){
                k++;
            }
        }for (int i=1;i<n;i++) {
            if (nums[i]==nums[i - 1]) {
                dup=nums[i];
            }
        }
        res.add(dup);
        res.add(k);
        
        int[] arr = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);   
        }
        return arr;
    }
}
