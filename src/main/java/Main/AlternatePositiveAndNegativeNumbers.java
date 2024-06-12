package Main;

public class AlternatePositiveAndNegativeNumbers {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                list2.add(arr[i]);
            }else{
                list1.add(arr[i]);
            }
        }
        int idx = 0;
        int i=0,j=0;
        for(i=0,j=0; i<list1.size() || j<list2.size(); i++,j++){
            if(i<list1.size()){
                arr[idx++] = list1.get(i);
            }
            if(j<list2.size()){
                arr[idx++] = list2.get(j);
            }
        }
    }
}
