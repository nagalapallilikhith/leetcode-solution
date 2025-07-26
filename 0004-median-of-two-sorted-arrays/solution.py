class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        num=nums1+nums2
        num.sort()
        #print(num)
        n=len(num)
        m=len(num)-1
        if n%2==0:
            result=(num[m//2]+num[(m+2)//2])/2
            #print(n//2)
        else:
            result=num[(m+1)//2]+0.00000
        return result


        
