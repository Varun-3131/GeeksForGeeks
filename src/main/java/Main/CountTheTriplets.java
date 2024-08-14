package Main;

public class CountTheTriplets {
    int countTriplet(int arr[], int n) {
        // code here
        int count = 0;
        Arrays.sort(arr);
        for(int i=n-1;i>-1;i--){
            int j = 0;
            int k = i-1;
            while(j<k){
                int sum = arr[j] + arr[k];
                if(sum == arr[i]){
                    count++;
                    j++;
                    k--;
                }
                else if(sum > arr[i]){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return count;
    }
}
