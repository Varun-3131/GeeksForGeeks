package Main;

public class BusConductor {
    public static int findMoves(int n, int[] chairs, int[] passengers) {
        // code here
        Arrays.sort(chairs);

        Arrays.sort(passengers);

        int ans = 0;

        for(int i=0; i<n; i++){
            ans += Math.abs(chairs[i] - passengers[i]);
        }

        return ans;
    }
}
