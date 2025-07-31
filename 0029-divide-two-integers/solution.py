class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if (dividend == -2147483648 and divisor == -1): return 2147483647
        result=abs(dividend)//abs(divisor)
        if dividend<0 and divisor<0:
            return result
        elif dividend<0 or divisor<0:
            return -result
        return result
        
