package Main;

public class BoundaryTraversalOfMatrix {
    //Function to return list of integers that form the boundary
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        ArrayList<Integer> a=new ArrayList<>();
        int l=0,r=m-1;
        int t=0,b=n-1;
        for(int i=0;i<=r;i++)
        {
            a.add(matrix[l][i]);
        }

        for(int i=l+1;i<=b;i++)
        {
            a.add(matrix[i][r]);
        }
        if(n>1)
        {
            for(int i=r-1;i>=0;i--)
            {
                a.add(matrix[b][i]);
            }
        }
        if(m>1)
        {
            for(int i=b-1;i>=1;i--)
            {
                a.add(matrix[i][l]);
            }
        }
        return a;

    }
}
