package Main;

public class MinAndMaxInArray {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        long min=arr[0];
        long max=arr[arr.length-1];
        return new Pair(min,max);
    }
}
