package Main;

public class MaximumIndex_I {
    // Function to find the maximum index difference.
    int maxIndexDiff(int[] arr) {
        // Your code here
        int n=arr.length;
        int minLeft[]=new int[n];
        int maxRight[]=new int[n];
        minLeft[0]=arr[0];
        for(int i=1;i<n;i++){
            minLeft[i]=Math.min(arr[i],minLeft[i-1]);
        }
        maxRight[n-1]=arr[n-1];
        for(int j=n-2;j>=0;j--){
            maxRight[j]=Math.max(arr[j],maxRight[j+1]);
        }
        int i=0;
        int j=0;
        int maxdiff=-1;
        while(i<n && j<n){
            if(minLeft[i]<=maxRight[j]){
                maxdiff=Math.max(maxdiff,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return maxdiff;
    }
}
