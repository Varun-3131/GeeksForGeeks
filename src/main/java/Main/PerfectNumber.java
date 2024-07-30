package Main;

public class PerfectNumber {
    static int isPerfectNumber(long N) {
        long sum = 0;
        for(int i=1;i<Math.sqrt(N);i++){
            if(N%i==0){
                sum=sum+i;

                if(N/i!=N)
                    sum = sum+N/i;
            }

        }
        return sum==N?1:0;
    }
}
