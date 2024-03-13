package Main;

public class FloorInSortedArray {
    static int findFloor(long arr[], int n, long x)
    {
        int index = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] <= x){
                index = i;
            }
            else
                break;
        }
        if(index == -1)
            return -1;
        return index;
    }
}
