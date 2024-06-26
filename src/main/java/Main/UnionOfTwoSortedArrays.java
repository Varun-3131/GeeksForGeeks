package Main;

public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        Set<Integer> set=new TreeSet<>();
        for(int num:arr1){
            set.add(num);}
        for(int num:arr2){
            set.add(num);}

        return new ArrayList<>(set);
    }
}
