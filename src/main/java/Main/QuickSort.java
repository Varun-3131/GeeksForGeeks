package Main;

public class QuickSort {
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low,pivotIndex-1 );
            quickSort(arr, pivotIndex+1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[low];
        int i = low;

        for(int j = low+1; j<=high; j++){
            if(pivot>arr[j]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[low];
        arr[low]= arr[i];
        arr[i] = temp;
        return i;
    }
}
