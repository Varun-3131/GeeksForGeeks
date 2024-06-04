package Main;

public class CountTheNumberOfPossibleTriangles {
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        int c=0;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int k=i+2;
            for(int j=i+1;j<n;j++){
                while(n>k && (arr[i]+arr[j])>arr[k])k++;

                c+=k-j-1;
            }
        }
        return c;
    }
}
