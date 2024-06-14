package Main;

public class LongestSubArrayWithSumK {
    public static int lenOfLongSubarr (int arr[], int N, int k) {
        int maxlen=0;
        int sum=0;
        HashMap<Integer,Integer>mymap=new HashMap<>();

        mymap.put(0,-1);
        for(int i=0;i<N;i++){
            sum =sum+arr[i];
            int rem=sum-k;
            if(mymap.containsKey(rem)){
                int len=i-mymap.get(rem);
                maxlen=Math.max(maxlen,len);
            }
            if(!mymap.containsKey(sum)){
                mymap.put(sum,i);
            }
        }

        return maxlen;
    }
}
