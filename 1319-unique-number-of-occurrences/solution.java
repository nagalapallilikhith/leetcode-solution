class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> set=new ArrayList<>();
        for(int i:arr){
            if(!set.contains(i)){
                set.add(i);
            }
        }
        int occu[]=new int[set.size()];
        for(int i=0;i<set.size();i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(set.get(i)==arr[j]){
                    count++;
                }
            }occu[i]=count;
        }
        for(int i=0;i<set.size();i++){
            for(int j=i+1;j<set.size();j++){
                if(occu[i]==occu[j]){
                    return false;
                }
            }
        }return true;
    }
}
