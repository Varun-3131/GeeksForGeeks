package Main;

public class ThreeWayPartitioning {
    //Function to partition the array around the range such
    //that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b)
    {
        // code here
        int n = arr.length;
        ArrayList<Integer> smallA = new ArrayList<>();
        ArrayList<Integer> atob = new ArrayList<>();
        ArrayList<Integer> greatB = new ArrayList<>();
        int count =0;
        for( int i=0;i<n;i++) {
            if(a>arr[i])
                smallA.add(arr[i]);
            else if(a<=arr[i] && b>=arr[i])
                atob.add(arr[i]);
            else if(b<arr[i])
                greatB.add(arr[i]);
        }

        if(!smallA.isEmpty()) {
            for(int i =0;i<smallA.size();i++) {
                arr[count++] = smallA.get(i);
            }
        }
        if(!atob.isEmpty()) {
            for(int i =0;i<atob.size();i++) {
                arr[count++] = atob.get(i);
            }
        }
        if(!greatB.isEmpty()) {
            for(int i =0;i<greatB.size();i++) {
                arr[count++] = greatB.get(i);
            }
        }
    }

}
