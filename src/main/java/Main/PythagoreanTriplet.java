package Main;

public class PythagoreanTriplet {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        Set<Integer> array=new HashSet<Integer>();

        for(int i=0;i<n;i++){
            arr[i]=arr[i]*arr[i];
            array.add(arr[i]);
        }
        for(int i:array){
            for(int j:array){
                if(array.contains(i+j)){
                    return true;
                }
            }
        }
        return false;
    }
}
