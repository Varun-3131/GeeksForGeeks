package Main;

public class TwoRepeatedElements {
    // Function to find two repeated elements.
    public int[] twoRepeated(int n, int arr[]) {
        // Your code here
        for(int i=0;i<n+2;i++){
            arr[i]=0-arr[i];
        }
        int last=0;
        for(int i=0;i<n+2;i++){
            if(arr[Math.abs(arr[i])-1]<0)arr[Math.abs(arr[i])-1]=Math.abs(arr[Math.abs(arr[i])-1]);
            else if(arr[Math.abs(arr[i])-1]>0){
                last=Math.abs(arr[i]);
                arr[Math.abs(arr[i])-1]=0-arr[Math.abs(arr[i])-1];
            }
        }
        int it=0,res[]=new int[2];
        for(int i=0;i<n;i++){
            if(it==2)break;
            if(arr[i]<0)res[it++]=i+1;
        }
        if(res[0]==last){
            last=res[0];
            res[0]=res[1];
            res[1]=last;
        }
        return res;
    }
}
