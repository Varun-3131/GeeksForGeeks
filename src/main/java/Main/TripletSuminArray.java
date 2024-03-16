package Main;

public class TripletSuminArray {
    public static boolean find3Numbers(int A[], int n, int X)
    {
        Arrays.sort(A);
        int j;
        int k;
        for(int i=0;i<n;i++)
        {
            j=i+1;
            k=n-1;
            while(j<k)
            {
                if(A[i]+A[j]+A[k]==X)
                {
                    return true;
                }
                else if(A[i]+A[j]+A[k]>X)
                {
                    k--;
                }
                else if(A[i]+A[j]+A[k]<X)
                {
                    j++;

                }
            }
        }

        return false;


    }
}
