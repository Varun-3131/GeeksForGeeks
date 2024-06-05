package Main;

public class RowWithMax1s {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here

        int rowMax = 0;
        int row = -1;

        for(int i = 0; i<n; i++)
        {
            int oneCount = 0;

            for(int j=0; j<m; j++)
            {
                if(arr[i][j] == 1)
                {
                    oneCount++;
                }
            }

            if(oneCount > rowMax)
            {
                rowMax = oneCount;
                row = i;
            }
        }

        return row;
    }
}
