package Main;

public class EqualLeftAndRightSubarraySum {
    int equalSum(int [] A, int N) {
        //Write your code here
        int rs=0,ls=0,ts=0;
        for(int a:A)ts+=a;
        for(int i=0;i<N;i++){
            rs=ts-ls-A[i];
            if(rs==ls)return i+1;
            else ls+=A[i];
        }
        return -1;
    }
}
