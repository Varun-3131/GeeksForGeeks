package Main;

public class RopeCutting {
    public static ArrayList<Integer> RopeCutting (int arr[], int n) {
        // Complete the Function
        ArrayList<Integer> L1 = new ArrayList<>();
        Arrays.sort(arr);

        int i= 0;
        int j = 1;

        while(i<n && j < n){
            if( arr[j] - arr[i] > 0 ){
                L1.add(n-j);
            }
            i++;
            j++;
        }
        return L1;
    }
}
