package Main;

public class YouAndYourBooks {
    long max_Books(int arr[], int n, int k) {
        long sum =0, max = 0;
        for(int i=0; i<n; i++){
            if(arr[i]<=k){
                sum+=arr[i];
            }else{

                max = Math.max(sum, max);
                sum = 0;
            }
        }
        max = Math.max(sum, max);
        return max;
    }
}
