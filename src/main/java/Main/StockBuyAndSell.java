package Main;

public class StockBuyAndSell {
    ArrayList<ArrayList<Integer>> stockBuySell(int a[], int n)
    {
        ArrayList<ArrayList<Integer>>res = new ArrayList<>();

        int i=0;

        while(i<n-1)
        {
            while(i<n-1 && a[i] >= a[i+1])
                i++;

            if(i==n-1)
                break;


            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(i);
            i++;


            while(i<n && a[i]>=a[i-1])
                i++;

            temp.add(i-1);

            res.add(temp);
        }
        return res;
    }
}
