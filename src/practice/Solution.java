package practice;

public class Solution {
    public int mySqrt(int x) {
        long i = 1;
        while (i * i <= x) {
            if (x >= i * i && x < (i + 1) * (i + 1)) return (int)i;
            i += 1;
        }
        return 0;
    }
}
