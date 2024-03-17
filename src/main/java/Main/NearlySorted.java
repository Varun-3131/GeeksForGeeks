package Main;

public class NearlySorted {
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        // your code here
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr)list.add(i);
        return list;
    }
}
