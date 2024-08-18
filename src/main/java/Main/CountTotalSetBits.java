package Main;

public class CountTotalSetBits {

    private int larPowOf2(int n) {
        int x = 0;
        while ((1 << x) <= n) x++;
        return x - 1;
    }

    public int countSetBits(int n) {
        if (n == 0) return 0;

        int x = larPowOf2(n);
        int y = x * (1 << (x - 1));
        int z = n - (1 << x);

        return y + z + 1 + countSetBits(z);
    }
}

