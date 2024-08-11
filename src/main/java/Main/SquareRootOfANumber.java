package Main;

public class SquareRootOfANumber {
    long floorSqrt(long n) {
        // Your code here
        long a = 0 ;
        if(n==0 || n==1){
            a = n;
        }
        for(long i = 1 ; i*i<=n ; i++ ){
            a=i;
        }
        return a;
    }
}
