from typing import List
import re
class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        l = ""
        nu = 0
        m = re.findall(r'\w+', paragraph.lower())
        
        banned = set(banned)  
        k = []  
        
        for i in m:
            if i not in k:
                c = 0
                for j in m:
                    if i == j:
                        c += 1
                
                if c > nu and i not in banned:
                    nu = c
                    l = i
                
                k.append(i)
        
        return l
