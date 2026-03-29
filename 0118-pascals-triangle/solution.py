
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        l = []
        for i in range(numRows):
            ll = []
            for j in range(i + 1):
                if j == 0 or j == i:
                    ll.append(1)
                else:
                   m = l[i-1][j-1] + l[i-1][j]
                   ll.append(m)
            l.append(ll)
        return l
