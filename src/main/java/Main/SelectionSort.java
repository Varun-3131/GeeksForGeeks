package Main;

public class SelectionSort {
    int  select(int arr[], int i)
    {
        // code here such that selectionSort() sorts arr[]
        int min =i;
        for(int j=i+1; j<arr.length;j++){
            if(arr[min]>arr[j])
                min=j;

        }
        return min;
    }
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    void selectionSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<n-1;i++)
        {
            int min=select(arr,i);
            swap(arr,min,i);
        }

    }
}
