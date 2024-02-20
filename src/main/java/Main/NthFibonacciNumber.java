package Main;

public class NthFibonacciNumber {
    static int nthFibonacci(int n){
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        int mod = 1000000007;
        arr.add(0);
        arr.add(1);
        if(n==1){
            return 1;
        }
        else{
            for(int i=2;i<=n;i++){
                int j=(arr.get(i-2)+arr.get(i-1))%mod;
                arr.add(j);
            }
            return arr.get(n);
        }
    }
}
