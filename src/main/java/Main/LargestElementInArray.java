package Main;

public class LargestElementInArray {
    public static int largestElement(int arr[], int n) {
        // Complete the Function
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
