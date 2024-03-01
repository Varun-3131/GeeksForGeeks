package Main;

public class BitMagic {
    public static int bitMagic(int n, int[] arr) {
        // code here
        int sum = 0;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) sum++;
        }

        if (sum % 2 == 0) return sum / 2;

        return sum / 2 + 1;
    }
}
