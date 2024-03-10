package Main;

public class RemoveDuplicateElementFromSortedArray {
    int remove_duplicate(int arr[],int N){
        // code here
        int i = 0;
        int j = 1;
        while(j < N){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        return i+1;
    }
}
