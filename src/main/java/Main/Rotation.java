package Main;

public class Rotation {
    int findKRotation(int arr[], int n) {
        // code here
        int temp[] = arr.clone();
        Arrays.sort(temp);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-temp[i]>0){
                count++;

            }
            else{
                break;
            }
        }
        return count;
    }
}
