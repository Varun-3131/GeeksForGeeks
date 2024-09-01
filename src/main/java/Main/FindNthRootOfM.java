package Main;

public class FindNthRootOfM {
    public static int func(int mid,int n,int m){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*mid;

            if(ans>m)
                return 2;
        }

        if(ans==m) return 1;

        return 0;
    }

    public static int NthRoot(int n,int m){
        int low=1;
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;

            int funcall=func(mid,n,m);

            if(funcall==1){
                return mid;
            }
            else if(funcall==0){
                low=mid+1;
            }
            else{
                high=mid-1;

            }
        }
        return -1;


    }
}
