class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int []temp=new int[n];
        int []res=new int[n];
        String []result=new String[n];
        for(int i=0;i<n;i++){
            temp[i]=score[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(temp[i]==score[j]){
                    res[j]=n-i-1;
                }
            }
        }for(int i=0;i<n;i++){
            if(res[i]==0){
                result[i]="Gold Medal";
            }else if(res[i]==1){
                result[i]="Silver Medal";
            }else if(res[i]==2){
                result[i]="Bronze Medal";
            }else{
                result[i]=String.valueOf(res[i]+1);
            }
        }return result;
    }
}
