package Main;

public class RearrangeArrayAlternately {
    public static void rearrange(long[] arr, int n) {

        // Your code here
        int i = 0;
        int j = arr.length - 1;
        int[] ans = new int[n];
        int k = 0;
        if (n > 1 && n % 2 == 0) {
            while (i < j) {
                ans[k++] = (int) arr[j];
                ans[k++] = (int) arr[i];
                j--;
                i++;
            }
            for (int r = 0; r < n; r++) {
                arr[r] = ans[r];
            }
        }
        if (n > 1 && n % 2 != 0) {
            while (i < j) {
                ans[k++] = (int) arr[j];
                ans[k++] = (int) arr[i];
                j--;
                i++;
            }
            if (i == j) ans[k] = (int) arr[j];
            for (int r = 0; r < n; r++) {
                arr[r] = ans[r];
            }
        }

    }
}
