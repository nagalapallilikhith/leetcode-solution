class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] prefi = new int[n];
        int mx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > mx) {
                mx = nums[i];
            }
            prefi[i] = gcd(mx, nums[i]);
        }
        Arrays.sort(prefi);
        int i = 0;
        int j = nums.length - 1;
        long sum = 0;
        while (i < j) {
            sum += gcd(prefi[i], prefi[j]);
            i++;
            j--;
        }
        return sum;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
