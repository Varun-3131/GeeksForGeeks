package Main;

public class ProductArrayPuzzle {
    public static long[] productExceptSelf(int nums[], int n)
    {
        // code here
        long sum = 1;
        int count = 0;
        Boolean flag = false;
        for(int i=0; i<n; i++){
            if(nums[i]!=0) sum*=nums[i];
            else {
                flag = true;
                count++;
            }
        }
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            if(flag ==false) arr[i] = sum/nums[i];
            else if(nums[i] == 0 && count<2) arr[i]=sum;
            else arr[i] = 0;
        }
        return arr;
    }
}
