package Main;

public class TicketCounter {

        public static int distributeTicket(int N,int K)
        {
            if(K==N){
                return N;
            }
            if(N/K>=2){
                int grps=N/K;
                if(grps%2==0){
                    if(N%K==0){
                        int pairs=grps/2;

                        return pairs*K+1;
                    }else{
                        int pairs=grps/2;
                        return N-pairs*K;
                    }

                }else{
                    if(N%K==0){
                        int pairs=(grps+1)/2;

                        return pairs*K;
                    }else{
                        int pairs=(grps+1)/2;

                        return pairs*K+1;
                    }
                }
            }else{
                return K+1;
            }

        }

}
