package Main;

public class CountTheZeros {

    int countZeroes(int[] arr) {
        // code here
        int l=0;
        int r=arr.length-1;
        if(arr[r]==1){
            return 0;
        }
        int c=0;
        while(l<=r){
            int mid=l+(r-l)/1;
            if(arr[mid]==0){
                c++;
                r=mid-1;
            }
            if(arr[mid]==1){
                l=mid+1;
            }
        }
        return c;
    }
}
