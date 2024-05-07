package Main;

public class SubarraysWithGivenSum {
    public static int subArraySum(int[] arr, int n, int sum)
    {
        //code here.
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0, currSum = 0;
        hm.put(0, 1);
        for(int i=0;i<n;++i) {
            currSum += arr[i];
            int searchSum = currSum - sum;
            if(hm.containsKey(searchSum)) {
                count += hm.get(searchSum);
            }
            if(!hm.containsKey(currSum)) {
                hm.put(currSum, 1);
            }
            else {
                hm.put(currSum, hm.get(currSum) + 1);
            }
        }
        return count;
    }
}
