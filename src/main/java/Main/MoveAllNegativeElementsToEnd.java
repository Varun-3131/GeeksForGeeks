package Main;

public class MoveAllNegativeElementsToEnd {
    public void segregateElements(int[] arr) {
        // Your code goes here
        ArrayList<Integer> list=new ArrayList<>();
        int j=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                list.add(arr[i]);
            }
            if(arr[i]>=0)
            {

                arr[j]=arr[i];
                j++;
            }
        }

        for(int k=j,i=0;k<n;k++,i++)
        {
            arr[k]=list.get(i);
        }

    }
}
