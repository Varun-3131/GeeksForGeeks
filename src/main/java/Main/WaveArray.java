package Main;

public class WaveArray {
    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i=0,j=1; i<n && j<n; i+=2,j+=2){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
