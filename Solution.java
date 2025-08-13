class Solution {
    public boolean isPowerOfThree(int n) {
        long x=1;
        while(x<(long)n)
            x*=3;
        return x==n;
    }
}