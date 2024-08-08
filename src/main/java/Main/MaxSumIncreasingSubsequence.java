package Main;

public class MaxSumIncreasingSubsequence {
    class Solution
    {
        public int maxSumIS(int arr[], int n)
        {

            int dp[]=new int[n];
            for(int i=0;i<n;i++){
                dp[i]=arr[i];
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    if(arr[j]<arr[i]&&dp[i]<dp[j]+arr[i]){
                        dp[i]=dp[j]+arr[i];
                    }
                }
            }

            int max=0;
            for(int a:dp){
                max=Math.max(max,a);
            }
            return max;

        }
}
