package Main;

public class _0_1KnapsackProblem {
    static int knapSack(int W, int wt[], int val[], int n)
    {
        int t[][] = new int[n+1][W+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                t[i][j]=-1;
            }
        }
        return knap(W,wt,val,n,t);
    }

    static int knap(int W, int wt[], int val[], int n, int t[][]){
        if(n==0 || W==0) return 0;
        if(t[n][W] != -1) return t[n][W];

        if(wt[n-1]<= W)
            return t[n][W]=Math.max(val[n-1]+knap(W-wt[n-1],wt,val,n-1,t),
                    knap(W,wt,val,n-1,t));

        else if(wt[n-1]>W) return t[n][W]=knap(W,wt,val,n-1,t);
        return t[n][W];
    }
}
