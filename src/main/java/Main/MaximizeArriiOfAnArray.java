package Main;

public class MaximizeArriiOfAnArray {
    int Maximize(int arr[], int n)
    {
        // Complete the function
        long sum = 0;
        long MOD = 1000000007;
        Arrays.sort(arr);
        for(int i = 0; i< arr.length;i++){
            sum = (sum+(long)arr[i]*i)%MOD ;

        }
        return (int) sum;
    }
}
