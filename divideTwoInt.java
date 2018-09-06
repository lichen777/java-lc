// https://leetcode.com/problems/divide-two-integers/description/

class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 0) {
            return 0;
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        int result = 0;
        while(dvd >= dvs){
            int shift = 1;
            while(dvd >= (dvs << shift)){
                shift++;
            }
            dvd -= dvs << (shift - 1);
            result += 1 << (shift - 1);
        }
        return isNegative ? -result : result;
    }
}
