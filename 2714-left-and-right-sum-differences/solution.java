
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        int ls[]=new int[n];
        int rs[]=new int[n];
        int res[]=new int[n];
        ls[0]=0;
        rs[n-1]=0;
        for(int i=1;i<n;i++){
            ls[i]=nums[i-1]+ls[i-1];
        }//System.out.print(Arrays.toString(ls));
        for(int i=n-2;i>=0;i--){
            rs[i]=nums[i+1]+rs[i+1];
        }//System.out.print(Arrays.toString(rs));
        for(int i=0;i<n;i++){
            res[i]=Math.abs(ls[i]-rs[i]);
        }
        return res;
    }
}
