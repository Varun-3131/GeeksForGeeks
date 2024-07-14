package Main;

public class PerfectSumProblem {
    public int perfectSum(int arr[],int n, int sum)
    {
        // Your code goes here
        int[][]dp = new int[n+1][sum+1];
        for(int[] i :  dp){
            Arrays.fill(i,-1);
        }
        int ans = helper(n,arr,sum,dp);
        return ans % 1000000007;
    }
    public static int helper(int n, int[] num, int tar, int[][] dp){
        if(n==0 && tar == 0) return 1;
        if(n==0 && tar != 0) return 0;
        if(dp[n][tar] != -1) return dp[n][tar];

        if(num[n-1]>tar){
            dp[n][tar] = (helper(n-1,num,tar,dp))% 1000000007;
            return dp[n][tar];
        }
        else{
            int taken = helper(n-1,num,tar-num[n-1],dp);
            int not = helper(n-1,num,tar,dp);
            dp[n][tar] = (taken+not)% 1000000007;
            return (taken+not)% 1000000007;
        }
    }
}
