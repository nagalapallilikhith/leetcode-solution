class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int lp=0,rp=n-1;
        int maxwater=0;
        while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int curwater=ht*width;
            maxwater=Math.max(maxwater,curwater);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
}
