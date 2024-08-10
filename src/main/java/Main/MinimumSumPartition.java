package Main;

public class MinimumSumPartition {
    static int find(int[] arr,int n,int s1,int s2,int[][] dp){
        if(n==-1) return Math.abs(s2-s1);
        if(dp[s1][s2]!=-1) return dp[s1][s2];
        return dp[s1][s2]=Math.min(find(arr,n-1,s1+arr[n],s2,dp),find(arr,n-1,s1,s2+arr[n],dp));

    }
    public int minDifference(int arr[], int n)
    {
        // Your code goes here
        int sum=0;
        if(n==1) return arr[0];
        for(int a:arr)
            sum+=a;
        int[][] dp=new int[sum+1][sum+1];
        for(int[] t:dp) Arrays.fill(t,-1);
        return find(arr,n-1,0,0,dp);
    }
}
