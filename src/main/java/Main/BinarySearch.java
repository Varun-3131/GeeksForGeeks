package Main;

public class BinarySearch {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int lower=0;
        int higher=arr.length-1;

        while(lower<=higher){
            int mid=(lower+higher)/2;

            if(arr[mid]>k){
                higher=mid-1;
            }
            else if(arr[mid]==k){
                return mid;
            }
            else{
                lower=mid+1;
            }
        }
        return -1;
    }
}
