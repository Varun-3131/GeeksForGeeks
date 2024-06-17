package Main;

public class FindAllPairsWithAGivenSum {
    public pair[] allPairs(long A[], long B[], long N, long M, long X){
        Arrays.sort(A);
        List<Long> lst = new ArrayList<>();
        for(int i=0;i<M;i++){
            lst.add(B[i]);
        }
        List<pair> alt = new ArrayList<>();
        for(int i=0;i<N;i++){
            if(lst.contains(X-A[i])){
                alt.add(new pair(A[i], X-A[i]));
            }
        }
        return alt.toArray(new pair[alt.size()]);
    }
}
