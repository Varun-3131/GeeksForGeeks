package Main;

public class ArraySearch {
    static int search(int arr[], int x) {

        // Your code here
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                index=i;
                return index;
            }
        }
        return -1;
    }
}
