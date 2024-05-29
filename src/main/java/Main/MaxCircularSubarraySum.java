package Main;

public class MaxCircularSubarraySum {
    static int circularSubarraySum(int a[], int n) {
        if(n==0) return 0;
        int x = kadanes(a,n);
        int y = 0;
        for(int i=0; i<n; i++) {
            y += a[i];
            a[i] *= -1;
        }
        int z = kadanes(a,n);
        if(y+z==0) return x;
        return Math.max(x, y+z);
    }

    static int kadanes(int a[], int n) {
        int temp = a[0], sum = a[0];
        for(int i=1; i<n; i++){
            temp += a[i];
            if(temp < a[i]){
                temp = a[i];
            }
            sum = Math.max(sum, temp);
        }
        return sum;
    }
}
