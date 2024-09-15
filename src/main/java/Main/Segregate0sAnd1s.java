package Main;

public class Segregate0sAnd1s {
    void segregate0and1(int[] arr) {
        int left=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                int temp=arr[left];
                arr[left]=arr[i];
                arr[i]=temp;
                flag=true;
                left++;
            }
        }
    }
}
