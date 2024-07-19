package Main;

public class SubsetSumProblem {

    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        int[][] dp = new int[N+1][sum+1];

        for(int i = 0; i < N; i++)
        {
            dp[i][0] = 1;
            if(sum == 0 && arr[i] == 0)
            {
                return true;
            }
        }

        for(int i = 1; i <= N; i++)
        {
            for(int j = 1; j <= sum; j++)
            {
                if(arr[i-1] <= j)
                {
                    if(dp[i-1][j-arr[i-1]] == 1 || dp[i-1][j] == 1)
                    {
                        dp[i][j] = 1;
                    }
                    else
                    {
                        dp[i][j] = 0;
                    }
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        if(dp[N][sum] == 1)
        {
            return true;
        }

        return false;
    }
}
