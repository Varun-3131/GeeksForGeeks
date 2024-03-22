package Main;

public class ComputeBeforeMatrix {
    public int[][] computeBeforeMatrix(int N, int M,int[][] after ){
        // Code here
        int b[][]= new int [N][M];
        b[0][0]= after[0][0];
        int t=b[0][0];
        int c[]= new int[M];
        for(int i=0;i<N;i++)
        {
            int q=0;
            t=0;
            for(int j=0;j<M;j++)
            {
                t=t+c[j]+q;
                if(i==0&&j==0)
                {
                }
                else
                {
                    b[i][j]=after[i][j]-t;
                }
                q=b[i][j];
                c[j]=c[j]+b[i][j];
            }
        }
        return b;
    }
}
