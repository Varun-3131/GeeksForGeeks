package Main;

public class SticklerThief {
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n){
        int pre2=arr[0];
        int pre1=Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            int ans=Math.max(pre2+arr[i],pre1);
            pre2=pre1; pre1=ans;
        }
        return pre1;
    }
}
