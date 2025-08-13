# aug13_2025
The problem that i solved today in leetcode

Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

Code:
class Solution {
    public boolean isPowerOfThree(int n) {
        long x=1;
        while(x<(long)n)
            x*=3;
        return x==n;
    }
}
