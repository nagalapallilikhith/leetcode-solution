class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean sol=false;
        if(arr.length<3){
            sol=false;
        }
        else{
        for(int i=0;i<arr.length-2; i++){
            if(arr[i]%2!=0 &&arr[i+1]%2!=0 && arr[i+2]%2!=0){
                sol=true;
            }
        }
        }
        return sol;
    }
}
