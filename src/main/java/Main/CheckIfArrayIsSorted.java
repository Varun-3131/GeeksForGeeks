package Main;

public class CheckIfArrayIsSorted {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for(int i = 1; i < n; i++) {
            if(arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}
