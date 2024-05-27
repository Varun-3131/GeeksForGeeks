package Main;

public class BitonicPoint {
    int findMaximum(int[] arr, int n) {
        // code here
        int low = 0,high = n-1;

        while(low <= high){
            //Base Cases
            if(low == high){
                return arr[low];
            }
            if(low+1 == high && arr[low]>arr[high]){
                return arr[low];
            }

            if(low+1 == high && arr[low] < arr[high]){
                return arr[high];
            }

            int mid = (low+high)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1] ){
                return arr[mid];
            }
            if(arr[mid] > arr[mid+1]){
                high = mid-1;
            }
            else{
                low  = mid + 1;
            }
        }
        return -1;
    }
}
