package Main;

public class ThreeGreatCandidates {
    long maxProduct(int[] arr) {
        // code here
        long first=Long.MIN_VALUE;
        long second=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;
        long s1=Long.MAX_VALUE;
        long s2=Long.MAX_VALUE;
        for(int i: arr){
            if(i>first) {
                third=second;
                second=first;
                first=i;
            }

            else if(i>second){
                third=second;
                second=i;
            }
            else if(i>third) third=i;
        }
        for(int i:arr){
            if(i<s1){
                s2=s1;
                s1=i;
            }
            else if(i<s2) s2=i;
        }
        long pro1=first*second*third;
        long pro2=s1*s2*first;
        return Math.max(pro1,pro2);
    }
}
