package Main;

public class MissingNumber {
    public static int missingNumber(int n, int[] arr) {
        int xor = 0;
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        for (int num : arr) {
            xor ^= num;
        }
        return xor;
    }
}
