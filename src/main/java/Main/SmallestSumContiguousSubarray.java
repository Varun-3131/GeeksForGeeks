package Main;

public class SmallestSumContiguousSubarray {
    static int smallestSumSubarray(int[] a, int size) {
        // your code here
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = Math.min(a[i], sum + a[i]);
            min = Math.min(min, sum);
        }
        return min;
    }
}
