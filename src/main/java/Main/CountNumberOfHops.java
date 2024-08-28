package Main;

public class CountNumberOfHops {

    //Function to count the number of ways in which frog can reach the top.
    static int mod = 1000000007;

    static long countWays(int n)
    {
        // add your code here
        long dp[] = new long[n+1];
        return find(n,dp);

    }

    static long find(int n,long dp[]){

        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }

        long one = find(n-1,dp);
        long two = find(n-2,dp);
        long three = find(n-3,dp);
        return dp[n] = (one + two + three)%mod;


    }
}
