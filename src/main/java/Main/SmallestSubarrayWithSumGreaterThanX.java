package Main;

public class SmallestSubarrayWithSumGreaterThanX {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here

        if(arr.length == 1){
            if(arr[0]<=x)
                return 0;
            else
                return 1;
        }

        int totalSum = Arrays.stream(arr).sum();
        if(totalSum<=x){
            return 0;
        }

        int count =Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            int sum =0;
            int j=i;
            int size =0;
            while(j<arr.length && sum<=x){
                sum += arr[j++];
                size++;
            }
            if(j==arr.length && sum<=x){
                return count;
            }
            count = Math.min(count, size);

        }

        return count;
    }

}
