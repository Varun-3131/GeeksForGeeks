package Main;

public class AlternatesInAnArray {
    public static void print(int arr[]) {
        // your code here
        for(int i=0;i<arr.length;i++){
            if((i-1)%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
