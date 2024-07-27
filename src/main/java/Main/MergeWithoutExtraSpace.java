package Main;

public class MergeWithoutExtraSpace {
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        // code here
        ArrayList<Long> a=new ArrayList();
        for(int i=0;i<n;i++)
        {

            a.add(arr1[i]);

        }
        for(int i=0;i<m;i++)
        {

            if(i<m)
                a.add(arr2[i]);
        }
        Collections.sort(a);

        for( int i=0;i<n;i++)
        {
            arr1[i]=a.get(i);
        }
        int i=0;
        for(int j=n;j<a.size();j++)
        {
            arr2[i]=a.get(j);
            i++;
        }
    }
}
