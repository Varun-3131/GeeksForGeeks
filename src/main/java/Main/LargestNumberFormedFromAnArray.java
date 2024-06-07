package Main;

public class LargestNumberFormedFromAnArray {
    String printLargest(int n, String[] arr) {
        // code here
        Arrays.sort(arr,(x,y) -> (y+x).compareTo(x+y));
        String result = String.join("", arr);
        return result;
    }
}
