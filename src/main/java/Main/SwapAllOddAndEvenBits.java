package Main;

public class SwapAllOddAndEvenBits {
    public static int swapBits(int n)
    {
        // Your code
        int  num=((n & 0x55555555)<<1 | (n & 0xAAAAAAAA)>>1) ;
        return num;
    }
}
