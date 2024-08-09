package Main;

public class FirstSetBit {
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){

        // Your code here
        if(n == 0)
        {
            return 0;
        }
        return Integer.numberOfTrailingZeros(n)+1;
    }
}
