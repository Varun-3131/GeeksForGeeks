package Main;

public class K_LargestElement {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        int result[] = new int[k];
        int index = 0;

        Arrays.sort(arr);

        for (int i = n - 1; i >= n - k; i--) {
            result[index++] = arr[i];
        }
        return result;
    }
}
