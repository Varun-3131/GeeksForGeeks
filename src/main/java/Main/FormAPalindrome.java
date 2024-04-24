package Main;

public class FormAPalindrome {
    int findMinInsertions(String S){
        int n = S.length();

        int len = longestPalinSubseq(S);

        return n - len;
    }

    public int longestPalinSubseq(String X)
    {
        String Y = new StringBuilder(X).reverse().toString();

        int m = X.length();
        int n = Y.length();

        int[][] dp = new int[m+1][n+1];

        for(int i = 0; i < m+1;i ++){
            for(int j = 0; j < n+1; j++)
                if(i == 0 || j == 0)
                    dp[i][j] = 0;
                else if(X.charAt(i-1) == Y.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
        return dp[m][n];
    }
}
