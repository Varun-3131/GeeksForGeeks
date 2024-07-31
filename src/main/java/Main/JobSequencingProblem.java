package Main;

public class JobSequencingProblem {
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (a,b)-> b.profit-a.profit);
        boolean p[] = new boolean[n+1];
        int res[] = new int[2];
        for(Job job: arr) {
            for(int i=job.deadline; i>=1; i--) {
                if(!p[i]) {
                    p[i] = true;
                    res[0]++;
                    res[1] += job.profit;
                    break;
                }
            }
        }
        return res;
    }
}
