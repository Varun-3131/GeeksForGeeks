package Main;

public class LongestCommonSubsequence {
    // Function to find the length of longest common subsequence in two strings.
    static int solve(int[][] dp,String s1,String s2,int i,int j)
    {
        if(i==-1||j==-1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int inc=0,ni=0;
        if(s1.charAt(i)==s2.charAt(j))
            inc=1+solve(dp,s1,s2,i-1,j-1);
        ni=Math.max(solve(dp,s1,s2,i-1,j),solve(dp,s1,s2,i,j-1));
        dp[i][j]=Math.max(inc,ni);
        return dp[i][j];
    }
    static int lcs(int n, int m, String s1, String s2) {
        // your code here
        int x=s1.length(),y=s2.length();
        int[][] dp=new int[x][y];
        for(int[] a:dp)
            Arrays.fill(a,-1);
        solve(dp,s1,s2,x-1,y-1);
        return dp[x-1][y-1];
    }
}
