package Main;

public class ArraySubset {
    public String isSubset( long a1[], long a2[], long n, long m) {

        int count=0;
        int i=0;
        int j=0;
        Arrays.sort(a1);
        Arrays.sort(a2);

        while(i<n && j<m){

            if(a1[i] == a2[j]){
                count++;
                i++;
                j++;
            }
            else if(a1[i] != a2[j]){
                i++;
            }
        }

        if(count == m){
            return "Yes";

        }
        else{
            return "No";

        }
    }
}
