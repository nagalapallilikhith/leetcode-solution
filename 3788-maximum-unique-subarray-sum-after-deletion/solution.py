class Solution:
    def maxSum(self, nums: List[int]) -> int:
        List1=list(set(nums))
        List1.sort()
        print(List1)
        List2=[]
        for i in List1:
                if i>0:
                    List2.append(i)
                    print(List2)
        if len(List2)==0:
            List2.append(max(nums))
        return sum(List2)
        
