package Main;

public class CountTheElements {
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int maxi = Integer.MIN_VALUE;
        int[] ans = new int[q];
        for(int i=0; i<n; i++){
            int x = Math.max(a[i],b[i]);
            maxi = Math.max(maxi,x);
        }
        int[] arr = new int[maxi+1];
        Arrays.fill(arr,0);

        for(int i=0;i<n;i++){
            arr[b[i]]++;
        }
        for(int i=1; i<maxi+1; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        for(int i=0; i<q; i++){
            ans[i] = arr[a[query[i]]];
        }
        return ans;
    }
}
