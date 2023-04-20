package practice;

public class Solution1 {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        long i = x;
        while (i * i > x)
            i = (i + x / i) / 2;
        return (int) i;
    }
}
