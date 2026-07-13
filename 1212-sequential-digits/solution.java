class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s="123456789";
        List<Integer> result=new ArrayList<>();
        for(int length=2;length<=9;length++){
            for(int i=0;i+length<=9;i++){
                int num=Integer.parseInt(s.substring(i,i+length));
                if(num>=low && num<=high){
                    result.add(num);
                }
            }
        }
        return result;
    }
}
